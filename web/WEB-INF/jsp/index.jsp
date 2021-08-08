<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tu Color</title>
    </head>
    <body style="background: black;color: whitesmoke;font-family: cursive;font-size: 200%;font-style: initial">
        <h1 style="background: purple;color: fuchsia">Tu Color!!!!</h1> 
        <center>
            <form method="POST">
                <label style="color: fuchsia;font-size: 100%">NOMBRE</label><br/>
                <input type="text" name="nombre" placeholder=" " required="required" style="font-size: 100%"/><br/>
                <label style="color: purple;font-size: 100%">EMAIL</label><br/>
                <input type="email" name="email" placeholder=" " required="required" style="font-size: 100%"/><br/>
                <br/>
                <br/>
                <input type="submit" value="Login" style="background: purple;color: fuchsia;font-family: cursive;font-size: 100%"/>
                <hr/>
            </form>
        </center>
    </body>
</html>
