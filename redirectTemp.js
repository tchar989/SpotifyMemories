const express = require('express')
const url = require('url')

const app = express()

app.get('/usercode', (req, res) => console.log(req))

app.listen(8080, () => console.log('Listening...'))