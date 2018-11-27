package com.qf.service;

public class XiaoMiService {

    public void miService(){
        MyDAO dao = new MyDAO();
        String res = dao.addDao();
        System.out.println(res);
    }

    public static void main(String[] args){
        XiaoMiService service = new XiaoMiService();
        service.miService();
    }
}
