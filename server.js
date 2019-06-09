const http = require('http');

const PORT = 3000;

const defaultContentType = {'Content-Type': 'application/json'};
const moviesList = [
    {id: 1, title: "First movie", rating: 9.0},
    {id: 2, title: "Second movie", rating: 8.5},
    {id: 3, title: "Third movie", rating: 9.3},
    {id: 4, title: "Fourth movie", rating: 8.9},
    {id: 5, title: "Fifth movie", rating: 9.9}
];

http.createServer((req, res) => {
    console.log(req.url);
    if(req.url === '/imdb/v1/movies') {
        res.writeHead(200, defaultContentType);
        res.write(JSON.stringify(moviesList));
        res.end();
    }
}).listen(PORT, () => console.log(`Running on port ${PORT}`));