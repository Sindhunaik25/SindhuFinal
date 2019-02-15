/* const express=require('express');
var app=express();

var list=['shirt','mobile','laptop','pens','book'];


app.get('/fetch', function (req, res) {
    var id=req.query.id;
    if(id>list.length-1 || id<0)
        res.send('enter valid id')
var value=list[id];
    res.send(value);
 })
 app.get('/delete', function (req, res) {
    var id=req.query.id;
    list.splice(0,id);
    res.send(list);
 }) 
app.listen(3005); */
/* 
var express = require('express');
var app = express();

var arr=[{name:'p1',price:10},{name:'p2',price:20},{name:'p3',price:30},{name:'p4',price:40},{name:'p5',price:50}]

app.get('/items', function (req, res) {
  res.send(arr);
})

app.post('/items', function (req, res) {
   var formdataname=req.query.name;
    var formdataprice=req.query.price;
  arr[arr.length]={name:formdataname,price:formdataprice};
   res.send(arr);
})

app.get('/items/:id', function (req, res) {

   res.send(arr[req.params.id]);
})

app.patch('/items/:id', function (req, res) {
   var formdataname=req.query.name;
    var formdataprice=req.query.price;
   res.send(arr[req.params.id]={name:formdataname,price:formdataprice});
   res.send(arr);
})

app.delete('/items/:id', function (req, res) { *//* const express=require('express');
var app=express();

var list=['shirt','mobile','laptop','pens','book'];


app.get('/fetch', function (req, res) {
    var id=req.query.id;
    if(id>list.length-1 || id<0)
        res.send('enter valid id')
var value=list[id];
    res.send(value);
 })
 app.get('/delete', function (req, res) {
    var id=req.query.id;
    list.splice(0,id);
    res.send(list);
 }) 
app.listen(3005); */

var express = require('express');
var app = express();

var arr=[{name:'p1',price:10},{name:'p2',price:20},{name:'p3',price:30},{name:'p4',price:40},{name:'p5',price:50}]

app.get('/items', function (req, res) {
  res.send(arr);
})

app.post('/items', function (req, res) {
   var formdataname=req.query.name;
    var formdataprice=req.query.price;
  arr[arr.length]={name:formdataname,price:formdataprice};
   res.send(arr);
})

app.get('/items/:id', function (req, res) {

   res.send(arr[req.params.id]);
})

app.patch('/items/:id', function (req, res) {
   var formdataname=req.query.name;
    var formdataprice=req.query.price;
   res.send(arr[req.params.id]={name:formdataname,price:formdataprice});
   res.send(arr);
})

app.delete('/items/:id', function (req, res) {

  /*  res.send(arr[req.params.id]=null);
   res.send(arr); */
   var id=req.query.id;
   arr.splice(0,id);
    res.send(arr);
})

var server = app.listen(3457, function () {
   var host = server.address().address
   var port = server.address().port

   console.log("Example app listening at http://%s:%s", host, port)
})


 

var server = app.listen(3457, function () {
   var host = server.address().address
   var port = server.address().port

   console.log("Example app listening at http://%s:%s", host, port)
})
