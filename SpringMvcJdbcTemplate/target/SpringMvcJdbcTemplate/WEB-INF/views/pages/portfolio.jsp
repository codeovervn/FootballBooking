<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
<link href="resources/css/styles.css" rel="stylesheet" type="text/css" />
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/reset.css" />
<link rel="stylesheet" type="text/css" href="resources/css/header.css" />
<link rel="stylesheet" type="text/css" href="resources/css/main.css" />
</head>
<body>
    <jsp:include page="/WEB-INF/views/includes/header.jsp" />
    <div id="page-wrap">
        <ul id="main-nav">
            <li class="home"><a href="index.html">Home</a></li>
            <li class="current"><a href="portfolio.html">Portfolio</a></li>
            <li class="services"><a href="services.html">Services</a></li>
            <li class="about"><a href="about.html">About Us</a></li>
            <li class="contact"><a href="contact.html">Contact</a></li>
        </ul>
        <div class="clear"></div>
        <div id="featured">
            <div id="image">
                <img src="images/sky.jpg" alt="sky"/>
            </div>
            <div id="featured-content">
                <h1>Blue is a wonderful Colour</h1>
                <p>
                    This is how an overlayed tabbed navigation menu looks like. This type of tabbed menus increase the visual appeal of any tabbed menu layouts. Its not that hard to code a menu like this. This is how an overlayed tabbed navigation menu looks like. This type of tabbed menus increase the visual appeal of any tabbed menu layouts. Its not that hard to code a menu like this This is how an overlayed tabbed navigation menu looks like.
                </p>
            </div>
        </div>
    </div><br/><br/>
    <jsp:include page="/WEB-INF/views/includes/footer.jsp" />
</body>
</html>