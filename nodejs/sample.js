const http=require('http');
const url=require('url');
const path=require('path');
const fs=require('fs');

const mimeTypes={
    "html":"text/html",
    "jpeg":"image/jpeg",
    "jpg":"image/jpg",
    "png":"image/png",
    "js":"text/javascript",
    "css":"text/css"
};

http.createServer(function(req,res)
{
    var uri=url.parse(req.url).pathname;
    var filename=path.join(process.cwd(),unescape(uri));
    console.log('loading'+uri);
    var stats;

    sats=fs.lstatSync(filename);
    if(stats.isFile())
    {
        var mimeType=mimeTypes[path.extname(filename).split(",").reverse()[0]];
        res.writeHead(200,{'Content-type':mimeType});
        var fileStream=fs.createReadStream(filename);
        fileStream.pipe(res);

    }
    else if(stats.isDirectory())
    {
        res.writeHead(302,{
            'Location' :'index.html'
        });
        res.end();
    }
    else
    {
        res.writeHead(500,{'Content-type':'text/plain'});
        res.write('500 Internal server');
        res.end();
    }
}).listen(3000);