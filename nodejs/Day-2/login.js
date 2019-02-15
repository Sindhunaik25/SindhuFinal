var express = require('express');
var app = express();

app.use(express.static('public'));
app.get('/login.html', function (req, res) {
   res.sendFile( __dirname + "/" + "login.html" );
})

app.get('/process_get', function (req, res) {
  
   response = {
     
      first_name:req.query.first_name=='Sindhu',
      last_name:req.query.Password=="abcd"
   
   };
   console.log(response);
   
   res.end( req.query.first_name+" "+req.query.Password+" "+JSON.stringify(response));
     
})

var server = app.listen(2005, function () {
   var host = server.address().address
   var port = server.address().port
   
   console.log("Example app listening at http://%s:%s", host, port)
})