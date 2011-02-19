<%@ page language="java"%>
<jsp:useBean id="bnTimeZone" class="com.gph.footer.TimeZoneUtil" />
<table width="100%" border="0" cellspacing="0" cellpadding="0" bgcolor="#FFFFFF">
      <tr>
        <td><img src="images/AppHome_Bottom.gif" width="100%" align="top"/></td>
      </tr>
       <tr>
       <td>
       <table cellpadding="0" cellspacing="0" BORDER="0" align="center">
        <tr class="pfooter">
          <td id="tend">Japan - <%=bnTimeZone.getJSTTime()%></td><td></td>
          <td id="tend">Eastern - <%=bnTimeZone.getEDTTime()%></td><td></td>
          <td id="tend">GMT - <%=bnTimeZone.getGMTTime()%></td><td></td>
          <td id="tend">India - <%=bnTimeZone.getISTTime()%></td><td></td>
          

        </tr>
        <tr>
	        <td  colspan="6" align="center">&nbsp;</td>
        </tr>
        <tr>
        <td class="border1" colspan="6" align="center">The Admin Console of MyCoolApp Application. (C) 2011 GenY Corporation!!  All Rights Reserved </td>
        </tr>
        </table>
      </td>
    </tr>
   </table>

