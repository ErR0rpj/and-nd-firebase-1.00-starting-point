const functions = require('firebase-functions');

// // Create and Deploy Your First Cloud Functions
// // https://firebase.google.com/docs/functions/write-firebase-functions
//
// exports.helloWorld = functions.https.onRequest((request, response) => {
//  response.send("Hello from Firebase!");
// });

exports.rand = functions.database.ref('/Stocks/{pushId}/isbuy').onWrite(event => {
	if(event.data.val() === 0){
		console.log("nahi chala ya 0 hai");
		return;
	}

	console.log("aage badha");
	var changed = changed.replace(1011);

	return event.data.ref.set(changed);

});