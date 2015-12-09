var express = require('express');
var passport = require('passport');
var router = express.Router();

var User = require('../models/user');

/* Utility function to check if user is authenticatd */
function requireAuth(req, res, next){

  // check if the user is logged in
  if(!req.isAuthenticated()){
    return res.redirect('/login');
  }
  next();
}

//GET Submit Page
router.get('/submit', function(req, res, next) {
  res.render('submit', { title: 'AWP Assignment 4 | Submit' });
});

//Get About Page
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
      messages: req.flash('loginMessage'),
      displayName:req.user ? req.user.displayName : ''
    });
    return;
  }
  else {
    return res.redirect('/users');
  }
});

/* Process the Login Request */
router.post('/login', passport.authenticate('local-login', {
    successRedirect: '/users',
    failureRedirect: '/login',
    failureFlash: true
}));

module.exports = router;

/* Show Registration Page */
router.get('/register', function (req, res, next) {
    if (!req.user) {
        res.render('register', {
            title: 'Register',
            messages: req.flash('registerMessage'),
            displayName: req.user ? req.user.displayName : ''
        });
    }
    else {
        return res.redirect('/');
    }
});

/* POST signup data. */
router.post('/register', passport.authenticate('local-registration', {
    //Success go to Profile Page / Fail go to Signup page
    successRedirect : '/users',
    failureRedirect : '/register',
    failureFlash : true
}));


/* Process Logout Request */
router.get('/logout', function (req, res){
  req.logout();
  res.redirect('/');
});


//added in the registration and login : Karen Springford//
//finished implementing login handling - passport, logout, etc. : Amanda Field//