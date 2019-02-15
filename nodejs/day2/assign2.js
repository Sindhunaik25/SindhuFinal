/* var express = require('express');
var app = express();

app.get('/:age', function (req, res) {
    var age=req.param('age');
    var year=2018-age;

  res.send('Your age is '+year);
}).listen(3003); */

var express = require('express');
var app = express();

app.get('/year', function (req, res) {
    var age=req.query.age;
    console.log(age);
    var year=2018-age;

  res.send('Your age is '+year);
}).listen(3003);