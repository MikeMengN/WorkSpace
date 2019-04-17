package org.mn.interceptor;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**  
* @Title: MySessionInterceptor  
* @Description: 自定义session拦截器  
* @author: MengNing  
* @date: 2019年4月15日下午11:21:45  
*/
public class MySessionInterceptor implements HandlerInterceptor {

	/* 
	 * @see org.springframework.web.servlet.HandlerInterceptor#afterCompletion(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, java.lang.Exception)
	 */
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	/* 
	 * @see org.springframework.web.servlet.HandlerInterceptor#postHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, org.springframework.web.servlet.ModelAndView)
	 */
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	/* 
	 * @see org.springframework.web.servlet.HandlerInterceptor#preHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object)
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("preHander执行...");
		// 取得session
		HttpSession session = request.getSession();
//		ServletContext context = session.getServletContext();
		System.out.println(session.getId());
		System.out.println(session.getAttribute("sUser"));
//		System.out.println(context.getAttribute(session.getId()));
		//如果session失效或者未登录，则返回false
		if(session.getAttribute("sUser") == null) {
			response.setContentType("text/html");  
            response.setCharacterEncoding("utf-8");  
            PrintWriter out = response.getWriter();    
            StringBuilder builder = new StringBuilder();    
            builder.append("<script type=\"text/javascript\" charset=\"UTF-8\">");    
            builder.append("alert(\"未登录或登录已过期，请重新登录！\");");    
            builder.append("parent.window.location.href='"+request.getContextPath()+"/index.jsp';");     
            builder.append("</script>");    
            out.print(builder.toString());    
            out.close();    
            return false; 
		} else {
			return true;
		}
	}

}
