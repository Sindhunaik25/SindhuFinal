 var express = require('express');
var app = express();
app.use(express.static('Images')); 
var server = app.listen(1001);
 