
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Video Player Test</title>
	<link href='http://fonts.googleapis.com/css?family=News+Cycle:400,700' rel='stylesheet' type='text/css'>
	<style>
		* {margin: 0; padding: 0;}
	
		html, body {
			background: #293c4e;
			font-family: "News Cycle", "helvetica neue", arial, sans-serif;
			font-size: 14px;
			color: #fff;
		}
		
		#navigation {
			font-size: 1.4em;
			background: #213241;
		}
		
		#navigation img {
			margin: 5px 40px 0 5px;
		}
		
		label {
			display: block;
			margin: 0 0 5px;
		}
		
		input {
			display: block;
			margin: 0 0 20px;
		}
		input[type="text"] {
			padding: 0 6px;
			line-height: 2em;
			border: none;
			border-radius: 4px;
			background: #fff;
			color: #000;
		}
		input[type="submit"] {
			margin: 0;
		}
		
		a {
		    color: #389AAE;
		    text-decoration: none;
		}
		
		a:hover {
			color: #63c8db;
		}
		
		#navigation a {
			display: inline-block;
			padding: 12px;
		}
		
		#navigation a:hover, #navigation a.selected {
			color: #fff;
		}
		
		#main-container {
			margin: 20px auto;
			width: 920px;
			padding: 20px;
			background: #213241;
			border-radius: 8px;
		}
		
		h2 {
			margin: 0 0 20px;
		}
		
		#footer {
			text-align: center;
			font-size: 0.9em;
			color: #fff;
		}
		
		table {
			color: #fff;
			border-color: #63c8db;
			border-collapse:collapse;
			font: inherit;
		}
		
		tbody tr td {
			border-top: 1px solid #63c8db;
		}
		
		tbody tr:hover {
			background: #293c4e;
		}
		
		td, th {
			text-align: left;
			vertical-align: top;
			padding: 5px;
			font-size: 1.2em;
		}
		
		td.name {
			width: 35%;
		}
		
		td.description {
			width: 55%;
			line-height: 1.4em;
		}
		
		td.actions {
			width: 10%;
		}
	</style>
</head>
<body>


<div id="navigation">
	<img width="91" height=91 src="http://si0.twimg.com/profile_images/1677349089/DB_logo_only_bigger.jpg" alt="Deep Blue Analytics">
	<a href="${pageContext.servletContext.contextPath}/list" >Video List</a>
	<a href="${pageContext.servletContext.contextPath}/report/topcontent?mediaIds=">Reports</a>
</div>

<div id="main-container">

