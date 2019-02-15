var express = require('express');
var app=express();
app.get('/index.html',function (req, res) {//Routing refers to how an application’s endpoints (URIs) respond to client requests
  res.sendFile(__dirname+"/"+"index.html");
})

app.get('/process_get',function(req,res){
  response={
    
  }
})