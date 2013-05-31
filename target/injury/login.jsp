<%@page pageEncoding="utf-8" contentType="text/html; charset=utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1"><title>
	湖南工伤康复管理系统--登陆页
</title>

<link href="css/log.css" rel="stylesheet" type="text/css" />
<script type="text/javascript">
	
</script>
</head>
<body>
    <form name="form1" method="post" action="log.do" id="logform">
	    <div class="leftform">
	        <div class="conLeftForm"></div>
	    </div>
	    <div class="rightform">
	        <div class="conRightForm">
	            <div class="dataForm">
	                <ul>
	                    <li class="dataTitle">湖南工伤康复管理系统 -- >登陆</li>                    
	                    <li class="inputstyle">
	                    	<span>帐 号：</span>
	                        <input name="username" type="text" id="username" class="FormBase" onfocus="this.className='FormFocus';" onblur="this.className='FormBase';" style="width:135px;" />
	                    </li>
	                    <li class="inputstyle">
	                    	<span>密 码：</span>
	                        <input name="password" type="password" id="password" class="FormBase" onfocus="this.className='FormFocus';" onblur="this.className='FormBase';" style="width:135px;" />
						</li>
	                    <li class="step_1">
	                        <input type="submit" value="登陆" />
	                    </li>
	                </ul>
	            </div>
	        </div>
	    </div>
	    <div class="bottomclass" style="text-align: center">
	        <span id="Label4">CopyRight © 2013 xxxxx有限公司</span>
	    </div>
	</form>
</body>
</html>

