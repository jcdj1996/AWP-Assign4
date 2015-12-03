var express = require('express');
var router = express.Router();

router.get('/submit', function(req, res, next) {
  res.render('submit', { title: 'AWP Assignment 4 | Submit' });
});
router.get('/about', function(req, res, next) {
  res.render('about', { title: 'AWP Assignment 4 | About' });
});
/* GET home page. */
router.get('/', function(req, res, next) {
  res.render('index', { title: 'AWP Assignment 4' });
});

module.exports = router;
