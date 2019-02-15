/* var fs = require('fs');
var count=0;
fs.readFile('message.txt',function(err,items){

    for(i=0;i<items.length;i++){
        for(j=0;j<items.length;j++)
        console.log(items.length);
        if(items[i]==items[j])
        count++;
    }
    console.log(count);
}); */
/* var fs = require('fs');
fs.readFile('message.txt','utf8',function (err, data) {
    if (err) throw err;
    if(data.indexOf('mallika') >0){
     console.log(data);
    }
  }); */

 /*  var fs = require('fs');
  var line=fs.readFileSync('read.txt','utf8').split('\n');

  var space=fs.readFileSync('read.txt','utf8').split(' ');
  var count=0;
   console.log(space.length);

console.log(line.length);
   
  for(i=0;i<line.length;i++){
    for(j=0;j<space.length;j++){
      if(space[j]=='vidhya')
      {
      count++;
      }
  }
}

console.log(count); 
  
  */

/* var count=0;
 var fs = require('fs');
var space=fs.readFileSync('read.txt','utf8').split(' ');
console.log(space);
for(j=0;j<space.length;j++){
   
    if(space[j]=='vidhya')
    {
    count++;
    }
    }
 
console.log(count); */

var fs = require('fs');
var fileName = 'read.txt'

fs.readFile(fileName, 'utf8', function(err, contentFile) {  
    if (err) throw err;
    var aWordsText = contentFile.split(' ');
    var aFilteredWords = aWordsText.filter(function(word){
        return word.includes('vidhya');
    })
    console.log(aFilteredWords.length);
});