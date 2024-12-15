const stompClient = new StompJs.Client({
    brokerURL: 'ws://localhost:8080/twoplayer-websocket'
});
$( "#status" ).hide();
const user1 = "user1";
const user2 = "user2"; +986


stompClient.onConnect = (frame) => {
    setConnected(true);
    console.log('Connected: ' + frame);
    stompClient.subscribe('/user/{user2}/next', (message) => {
        showMessage(message.body);
    });
};

stompClient.onWebSocketError = (error) => {
    console.error('Error with websocket', error);
};

stompClient.onStompError = (frame) => {
    console.error('Broker reported error: ' + frame.headers['message']);
    console.error('Additional details: ' + frame.body);
};

function setConnected(connected) {
    $("#connect").prop("disabled", connected);
    $("#disconnect").prop("disabled", !connected);
}

function connect() {
    stompClient.activate();
}

function disconnect() {
    stompClient.deactivate();
    setConnected(false);
    console.log("Disconnected");
}

function sendMessage() {
    const message = {
                    	"sender": user1,
                    	"receiver": user2,
                    	"state": [
                    		null,
                    		null,
                    		"",
                    		"",
                    		"",
                    		"",
                    		"",
                    		"",
                    		""
                    	],
                    	"next": "X"
                    };
    stompClient.publish({
        destination: "/twoplayer/play",
        body: JSON.stringify(message)
    });
}

function showMessage(message) {
    console.log(message);
}

$(function () {
    $("form").on('submit', (e) => e.preventDefault());
    $( "#connect" ).click(() => connect());
    $( "#disconnect" ).click(() => disconnect());
    $( "#send" ).click(() => sendMessage());

});