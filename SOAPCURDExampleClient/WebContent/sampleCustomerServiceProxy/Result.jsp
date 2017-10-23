<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleCustomerServiceProxyid" scope="session" class="com.bcj.soapcrud.service.CustomerServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleCustomerServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleCustomerServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleCustomerServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.bcj.soapcrud.service.CustomerService getCustomerService10mtemp = sampleCustomerServiceProxyid.getCustomerService();
if(getCustomerService10mtemp == null){
%>
<%=getCustomerService10mtemp %>
<%
}else{
        if(getCustomerService10mtemp!= null){
        String tempreturnp11 = getCustomerService10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String age_2id=  request.getParameter("age18");
        int age_2idTemp  = Integer.parseInt(age_2id);
        String lastName_3id=  request.getParameter("lastName20");
            java.lang.String lastName_3idTemp = null;
        if(!lastName_3id.equals("")){
         lastName_3idTemp  = lastName_3id;
        }
        String firstName_4id=  request.getParameter("firstName22");
            java.lang.String firstName_4idTemp = null;
        if(!firstName_4id.equals("")){
         firstName_4idTemp  = firstName_4id;
        }
        String id_5id=  request.getParameter("id24");
        int id_5idTemp  = Integer.parseInt(id_5id);
        %>
        <jsp:useBean id="com1bcj1soapcrud1entity1Customer_1id" scope="session" class="com.bcj.soapcrud.entity.Customer" />
        <%
        com1bcj1soapcrud1entity1Customer_1id.setAge(age_2idTemp);
        com1bcj1soapcrud1entity1Customer_1id.setLastName(lastName_3idTemp);
        com1bcj1soapcrud1entity1Customer_1id.setFirstName(firstName_4idTemp);
        com1bcj1soapcrud1entity1Customer_1id.setId(id_5idTemp);
        boolean addCustomer13mtemp = sampleCustomerServiceProxyid.addCustomer(com1bcj1soapcrud1entity1Customer_1id);
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addCustomer13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
break;
case 26:
        gotMethod = true;
        String id_6id=  request.getParameter("id37");
        int id_6idTemp  = Integer.parseInt(id_6id);
        com.bcj.soapcrud.entity.Customer getCustomerById26mtemp = sampleCustomerServiceProxyid.getCustomerById(id_6idTemp);
if(getCustomerById26mtemp == null){
%>
<%=getCustomerById26mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">age:</TD>
<TD>
<%
if(getCustomerById26mtemp != null){
%>
<%=getCustomerById26mtemp.getAge()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">lastName:</TD>
<TD>
<%
if(getCustomerById26mtemp != null){
java.lang.String typelastName31 = getCustomerById26mtemp.getLastName();
        String tempResultlastName31 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typelastName31));
        %>
        <%= tempResultlastName31 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">firstName:</TD>
<TD>
<%
if(getCustomerById26mtemp != null){
java.lang.String typefirstName33 = getCustomerById26mtemp.getFirstName();
        String tempResultfirstName33 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typefirstName33));
        %>
        <%= tempResultfirstName33 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(getCustomerById26mtemp != null){
%>
<%=getCustomerById26mtemp.getId()
%><%}%>
</TD>
</TABLE>
<%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>