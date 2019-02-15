
var fs = require('fs');

    fs.writeFile('message.txt', 'Welcome to Capgemini!!!!', function(err) {

        if (err) throw err;

        console.log('It\'s saved! in same location.');

    });

 



