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

//GET the Register User Page. */
router.get('/register', function(req, res, next){
  res.render('register', { title: 'AWP Assignment 4 | Register' });
});

//Render LOGIN page. //
router.get('/login', function (req, res, next){
  if(!req.user) {
    console.log("rendering login");
    res.render('login', {
      title: 'Login',
      messages:req.flash('loginMessage'),
      displayName:req.user ? req.user.displayName : ''
    });
    return;
  }
  else {
    return res.redirect('/users');
  }
});

module.exports = router;

//added in the registration and login : Karen Springford//
