/* const http = require('http');

const hostname = '127.0.0.1';
const port = 3000;

const server = http.createServer((req, res) => {
  res.statusCode = 200;
  res.setHeader('Content-Type', 'text/plain');
  res.end('Success\n');
});

server.listen(port, hostname, () => {
  console.log(`Server running at http://${hostname}:${port}/`);
}); */


const http = require('http');
function abc(request, response) {
  response.writeHead(200, {'Content-Type': 'text/plain'});
  
  response.end('Success\n');
}

http.createServer(abc).listen(3000);

console.log('Server running at http://127.0.0.1:3000/');