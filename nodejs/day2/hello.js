var express = require('express');
var app = express();//creating the object
app.get('/', function (req, res) {//Routing refers to how an application’s endpoints (URIs) respond to client requests
  res.send('Hello World');
}).listen(3002);