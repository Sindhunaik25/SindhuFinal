const express=require('express');
var app=express();

var list=['shirt','mobile','laptop'];


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
app.listen(3004);