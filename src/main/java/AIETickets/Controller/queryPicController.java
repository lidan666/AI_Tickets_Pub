package AIETickets.Controller;

import AIETickets.Model.ETicketInfo;
import AIETickets.Util.JsonUtil;
import com.mongodb.*;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
@RequestMapping("AI")
public class queryPicController {

    @RequestMapping("screenshot_01")
    public void screenshot_01(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try{
            String id = (String)request.getSession().getAttribute("pic_id");

            MongoClient client = new MongoClient("192.168.1.109",27017);
            DB db = client.getDB("BTW_MU_AI");
            GridFS gridFS = new GridFS(db,"fs");
            GridFS gridFS1 = new GridFS(db,"cutPic");

            GridFSDBFile gridFSDBFile = (GridFSDBFile)gridFS.findOne(new ObjectId(id));
            String PsgName_id = (String) gridFSDBFile.get("PsgName_id");

            GridFSDBFile gridFSDBFile1 = (GridFSDBFile)gridFS1.findOne(new ObjectId(PsgName_id));

            if (gridFSDBFile1 != null) {
                OutputStream sos = response.getOutputStream();
                response.setContentType("application/octet-stream");
                gridFSDBFile1.writeTo(sos);
                sos.flush();
                sos.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @RequestMapping("screenshot_02")
    public void screenshot_02(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try{
            String id = (String)request.getSession().getAttribute("pic_id");

            MongoClient client = new MongoClient("192.168.1.109",27017);
            DB db = client.getDB("BTW_MU_AI");
            GridFS gridFS = new GridFS(db,"fs");
            GridFS gridFS1 = new GridFS(db,"cutPic");

            GridFSDBFile gridFSDBFile = (GridFSDBFile)gridFS.findOne(new ObjectId(id));
            String PsgID_id = (String) gridFSDBFile.get("PsgID_id");

            GridFSDBFile gridFSDBFile1 = (GridFSDBFile)gridFS1.findOne(new ObjectId(PsgID_id));

            if (gridFSDBFile1 != null) {
                OutputStream sos = response.getOutputStream();
                response.setContentType("application/octet-stream");
                gridFSDBFile1.writeTo(sos);
                sos.flush();
                sos.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @RequestMapping("screenshot_03")
    public void screenshot_03(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try{
            String id = (String)request.getSession().getAttribute("pic_id");

            MongoClient client = new MongoClient("192.168.1.109",27017);
            DB db = client.getDB("BTW_MU_AI");
            GridFS gridFS = new GridFS(db,"fs");
            GridFS gridFS1 = new GridFS(db,"cutPic");

            GridFSDBFile gridFSDBFile = (GridFSDBFile)gridFS.findOne(new ObjectId(id));
            String ETicket_id = (String) gridFSDBFile.get("ETicket_id");

            GridFSDBFile gridFSDBFile1 = (GridFSDBFile)gridFS1.findOne(new ObjectId(ETicket_id));

            if (gridFSDBFile1 != null) {
                OutputStream sos = response.getOutputStream();
                response.setContentType("application/octet-stream");
                gridFSDBFile1.writeTo(sos);
                sos.flush();
                sos.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @RequestMapping("rotatescreenshot_01")
    public void rotatescreenshot_01(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try{
            String id = (String)request.getSession().getAttribute("pic_rotate_id");
            String value = (String) request.getSession().getAttribute("value");
            if(value!=null){
                String regex=value.substring(6,value.indexOf("_"));
                String rotatename = "NameCutRotate"+regex+"_id";
                String bucket = "NAMECutRotate_"+regex;

                MongoClient client = new MongoClient("192.168.1.109",27017);
                DB db = client.getDB("BTW_MU_AI");
                GridFS gridFS = new GridFS(db,"fs");
                GridFS gridFS1 = new GridFS(db,"cutPic");
                GridFS gridFS2 = new GridFS(db,bucket);

                GridFSDBFile gridFSDBFile = (GridFSDBFile)gridFS.findOne(new ObjectId(id));
                String PsgName_id = (String) gridFSDBFile.get("PsgName_id");
                GridFSDBFile gridFSDBFile1 = (GridFSDBFile)gridFS1.findOne(new ObjectId(PsgName_id));
                String rotatePsgName_id = (String) gridFSDBFile1.get(rotatename);
                GridFSDBFile gridFSDBFile2 = (GridFSDBFile)gridFS2.findOne(new ObjectId(rotatePsgName_id));

                if (gridFSDBFile2 != null) {
                    OutputStream sos = response.getOutputStream();
                    response.setContentType("application/octet-stream");
                    gridFSDBFile2.writeTo(sos);
                    sos.flush();
                    sos.close();
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @RequestMapping("rotatescreenshot_02")
    public void rotatescreenshot_02(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try{
            String id = (String)request.getSession().getAttribute("pic_rotate_id");
            String value = (String) request.getSession().getAttribute("value");
            if(value!=null){
                String regex=value.substring(6,value.indexOf("_"));
                String rotatename = "IDCutRotate"+regex+"_id";
                String bucket = "IDCutRotate_"+regex;

                MongoClient client = new MongoClient("192.168.1.109",27017);
                DB db = client.getDB("BTW_MU_AI");
                GridFS gridFS = new GridFS(db,"fs");
                GridFS gridFS1 = new GridFS(db,"cutPic");
                GridFS gridFS2 = new GridFS(db,bucket);

                GridFSDBFile gridFSDBFile = (GridFSDBFile)gridFS.findOne(new ObjectId(id));
                String PsgName_id = (String) gridFSDBFile.get("PsgID_id");
                GridFSDBFile gridFSDBFile1 = (GridFSDBFile)gridFS1.findOne(new ObjectId(PsgName_id));
                String rotatePsgName_id = (String) gridFSDBFile1.get(rotatename);
                GridFSDBFile gridFSDBFile2 = (GridFSDBFile)gridFS2.findOne(new ObjectId(rotatePsgName_id));

                if (gridFSDBFile2 != null) {
                    OutputStream sos = response.getOutputStream();
                    response.setContentType("application/octet-stream");
                    gridFSDBFile2.writeTo(sos);
                    sos.flush();
                    sos.close();
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @RequestMapping("rotatescreenshot_03")
    public void rotatescreenshot_03(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try{
            String id = (String)request.getSession().getAttribute("pic_rotate_id");
            String value = (String) request.getSession().getAttribute("value");
            if(value!=null){
                String regex=value.substring(6,value.indexOf("_"));
                String rotatename = "NOCutRotate"+regex+"_id";
                String bucket = "NOCutRotate_"+regex;

                MongoClient client = new MongoClient("192.168.1.109",27017);
                DB db = client.getDB("BTW_MU_AI");
                GridFS gridFS = new GridFS(db,"fs");
                GridFS gridFS1 = new GridFS(db,"cutPic");
                GridFS gridFS2 = new GridFS(db,bucket);

                GridFSDBFile gridFSDBFile = (GridFSDBFile)gridFS.findOne(new ObjectId(id));
                String PsgName_id = (String) gridFSDBFile.get("ETicket_id");
                GridFSDBFile gridFSDBFile1 = (GridFSDBFile)gridFS1.findOne(new ObjectId(PsgName_id));
                String rotatePsgName_id = (String) gridFSDBFile1.get(rotatename);
                GridFSDBFile gridFSDBFile2 = (GridFSDBFile)gridFS2.findOne(new ObjectId(rotatePsgName_id));

                if (gridFSDBFile2 != null) {
                    OutputStream sos = response.getOutputStream();
                    response.setContentType("application/octet-stream");
                    gridFSDBFile2.writeTo(sos);
                    sos.flush();
                    sos.close();
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @RequestMapping("gaosiscreenshot_01")
    public void gaosiscreenshot_01(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try{
            String id = (String)request.getSession().getAttribute("pic_gaosi_id");
            String gaosivalue = (String) request.getSession().getAttribute("gaosivalue");
            String gaositext = (String) request.getSession().getAttribute("gaositext");
            if(gaosivalue!=null&&gaositext!=null){
                String gaosiname = "NAMECut"+gaosivalue;
                String bucket = "NAMECut"+gaositext;

                MongoClient client = new MongoClient("192.168.1.109",27017);
                DB db = client.getDB("BTW_MU_AI");
                GridFS gridFS = new GridFS(db,"fs");
                GridFS gridFS1 = new GridFS(db,"cutPic");
                GridFS gridFS2 = new GridFS(db,bucket);

                GridFSDBFile gridFSDBFile = (GridFSDBFile)gridFS.findOne(new ObjectId(id));
                String PsgName_id = (String) gridFSDBFile.get("PsgName_id");
                GridFSDBFile gridFSDBFile1 = (GridFSDBFile)gridFS1.findOne(new ObjectId(PsgName_id));
                String gaosiPsgName_id = (String) gridFSDBFile1.get(gaosiname);
                GridFSDBFile gridFSDBFile2 = (GridFSDBFile)gridFS2.findOne(new ObjectId(gaosiPsgName_id));

                if (gridFSDBFile2 != null) {
                    OutputStream sos = response.getOutputStream();
                    response.setContentType("application/octet-stream");
                    gridFSDBFile2.writeTo(sos);
                    sos.flush();
                    sos.close();
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @RequestMapping("gaosiscreenshot_02")
    public void gaosiscreenshot_02(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try{
            String id = (String)request.getSession().getAttribute("pic_gaosi_id");
            String gaosivalue = (String) request.getSession().getAttribute("gaosivalue");
            String gaositext = (String) request.getSession().getAttribute("gaositext");
            if(gaosivalue!=null&&gaositext!=null){
                String gaosiname = "IDCut"+gaosivalue;
                String bucket = "IDCut"+gaositext;

                MongoClient client = new MongoClient("192.168.1.109",27017);
                DB db = client.getDB("BTW_MU_AI");
                GridFS gridFS = new GridFS(db,"fs");
                GridFS gridFS1 = new GridFS(db,"cutPic");
                GridFS gridFS2 = new GridFS(db,bucket);

                GridFSDBFile gridFSDBFile = (GridFSDBFile)gridFS.findOne(new ObjectId(id));
                String PsgName_id = (String) gridFSDBFile.get("PsgID_id");
                GridFSDBFile gridFSDBFile1 = (GridFSDBFile)gridFS1.findOne(new ObjectId(PsgName_id));
                String gaosiPsgName_id = (String) gridFSDBFile1.get(gaosiname);
                GridFSDBFile gridFSDBFile2 = (GridFSDBFile)gridFS2.findOne(new ObjectId(gaosiPsgName_id));

                if (gridFSDBFile2 != null) {
                    OutputStream sos = response.getOutputStream();
                    response.setContentType("application/octet-stream");
                    gridFSDBFile2.writeTo(sos);
                    sos.flush();
                    sos.close();
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @RequestMapping("gaosiscreenshot_03")
    public void gaosiscreenshot_03(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try{
            String id = (String)request.getSession().getAttribute("pic_gaosi_id");
            String gaosivalue = (String) request.getSession().getAttribute("gaosivalue");
            String gaositext = (String) request.getSession().getAttribute("gaositext");
            if(gaosivalue!=null&&gaositext!=null){
                String gaosiname = "NOCut"+gaosivalue;
                String bucket = "NOCut"+gaositext;

                MongoClient client = new MongoClient("192.168.1.109",27017);
                DB db = client.getDB("BTW_MU_AI");
                GridFS gridFS = new GridFS(db,"fs");
                GridFS gridFS1 = new GridFS(db,"cutPic");
                GridFS gridFS2 = new GridFS(db,bucket);

                GridFSDBFile gridFSDBFile = (GridFSDBFile)gridFS.findOne(new ObjectId(id));
                String PsgName_id = (String) gridFSDBFile.get("ETicket_id");
                GridFSDBFile gridFSDBFile1 = (GridFSDBFile)gridFS1.findOne(new ObjectId(PsgName_id));
                String gaosiPsgName_id = (String) gridFSDBFile1.get(gaosiname);
                GridFSDBFile gridFSDBFile2 = (GridFSDBFile)gridFS2.findOne(new ObjectId(gaosiPsgName_id));

                if (gridFSDBFile2 != null) {
                    OutputStream sos = response.getOutputStream();
                    response.setContentType("application/octet-stream");
                    gridFSDBFile2.writeTo(sos);
                    sos.flush();
                    sos.close();
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @RequestMapping("mongoDBOriginList")
    @ResponseBody
    public void mongoDBOriginList(HttpServletRequest request,HttpServletResponse response) throws IOException{
        response.setCharacterEncoding("utf-8");
        PrintWriter pw = response.getWriter();

        String filename = request.getParameter("filename");
        String eTicket_alias = request.getParameter("ETicket_Alias");
        String nameOfPassenger = request.getParameter("nameOfPassenger");

        MongoClient client = new MongoClient("192.168.1.109", 27017);
        DB db = client.getDB("BTW_MU_AI");
        DBCollection collection = db.getCollection("fs.files");

        int pageSize = Integer.parseInt(request.getParameter("pageSize"));
        int offset = 0;

        if(filename.isEmpty()&&eTicket_alias.isEmpty()&&nameOfPassenger.isEmpty()){
            offset = Integer.parseInt(request.getParameter("offset"));
        }

        List<BasicDBObject>  origincollection = new ArrayList<BasicDBObject>();
        int total = collection.find(mongodbData(filename,eTicket_alias,nameOfPassenger)).count();

        Iterator<DBObject> cursor = collection.find(mongodbData(filename,eTicket_alias,nameOfPassenger)).skip(offset*pageSize).limit(pageSize).iterator();
        while (cursor.hasNext()) {
            BasicDBObject bdbObj = (BasicDBObject) cursor.next();
            origincollection.add(bdbObj);
        }
//        String json = "{\"total\":" + collection.count() + ",\"rows\":" + origincollection + "}";
        String json = "{\"total\":" + total + ",\"rows\":" + origincollection + "}";
        pw.print(json);
//        System.out.println("json:"+json);
    }

    public BasicDBObject  mongodbData(String filename,String eTicket_alias,String nameOfPassenger){
        BasicDBObject query = new BasicDBObject();
        //无参查询
        if(filename.isEmpty()&&nameOfPassenger.isEmpty()&&eTicket_alias.isEmpty()){

        }//三个参数
        else if(!filename.isEmpty()&&!nameOfPassenger.isEmpty()&&!eTicket_alias.isEmpty()){
           query.put("filename", filename);
           query.put("nameOfPassenger", nameOfPassenger);
           query.put("ETicket_Alias", eTicket_alias);
        }//只查原图片名
        else if(!filename.isEmpty()&&nameOfPassenger.isEmpty()&&eTicket_alias.isEmpty()){
            query.put("filename", filename);
        }//只查旅客姓名
        else if(filename.isEmpty()&&!nameOfPassenger.isEmpty()&&eTicket_alias.isEmpty()){
            query.put("nameOfPassenger", nameOfPassenger);
        }//只查原图别名
        else if(filename.isEmpty()&&nameOfPassenger.isEmpty()&&!eTicket_alias.isEmpty()){
            query.put("ETicket_Alias", eTicket_alias);
        }//查原图别名和旅客姓名
        else if(!filename.isEmpty()&&!nameOfPassenger.isEmpty()&&eTicket_alias.isEmpty()){
            query.put("filename", filename);
            query.put("nameOfPassenger", nameOfPassenger);
        }
        else if(!filename.isEmpty()&&nameOfPassenger.isEmpty()&&!eTicket_alias.isEmpty()){
            query.put("filename", filename);
            query.put("ETicket_Alias", eTicket_alias);
        }
        else if(filename.isEmpty()&&!nameOfPassenger.isEmpty()&&!eTicket_alias.isEmpty()){
            query.put("nameOfPassenger", nameOfPassenger);
            query.put("ETicket_Alias", eTicket_alias);
        }
        return query;
    }

    @RequestMapping("mongoDBOriginCollection")
    public String mongoDBOriginCollection(HttpServletRequest request, HttpServletResponse response, Model model){
        return "AI/mongoDBOriginList";
    }
    @RequestMapping("mongoDBRotateCollection")
    public String mongoDBRotateCollection(HttpServletRequest request, HttpServletResponse response, Model model){
        return "AI/mongoDBRotateList";
    }
    @RequestMapping("mongoDBGaoSiCollection")
    public String mongoDBGaoSiCollection(HttpServletRequest request, HttpServletResponse response, Model model){
        return "AI/mongoDBGaoSiList";
    }

    @RequestMapping("MongoDBPicInfo")
    public String MongoDBPicInfo(HttpServletRequest request, HttpServletResponse response,@RequestParam String id){
        //获取到前台mongoDBOriginList.jsp中src拼接的id
        request.getSession().setAttribute("pic_id",id);
        return "AI/MongoDBPicInfo";
    }

    @RequestMapping("MongoDBPicInfo_origin")
    public void MongoDBPicInfo_origin(HttpServletRequest request, HttpServletResponse response){
//        System.out.println("request:"+request);
        String id = (String)request.getSession().getAttribute("pic_id");
//        System.out.println("id:"+id);
        try{
            MongoClient client = new MongoClient("192.168.1.109",27017);
            DB db = client.getDB("BTW_MU_AI");
            GridFS gridFS = new GridFS(db,"fs");
            GridFSDBFile gridFSDBFile = (GridFSDBFile)gridFS.findOne(new ObjectId(id));
            if (gridFSDBFile != null) {
                OutputStream sos = response.getOutputStream();
                response.setContentType("application/octet-stream");
                gridFSDBFile.writeTo(sos);
                sos.flush();
                sos.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @RequestMapping("originImg_Information")
    @ResponseBody
//    public List<String> originImg_Information(HttpServletRequest request, HttpServletResponse response, Model model) throws IOException {
    public void originImg_Information(HttpServletRequest request, HttpServletResponse response) throws IOException {

        MongoClient client = new MongoClient("192.168.1.109",27017);
        DB db = client.getDB("BTW_MU_AI");
        GridFS gridFS = new GridFS(db,"fs");

        String id = (String)request.getSession().getAttribute("pic_id");

        GridFSDBFile gridFSDBFile = (GridFSDBFile)gridFS.findOne(new ObjectId(id));

        ETicketInfo eTicketInfo = new ETicketInfo();

        String nameOfPic = (String) gridFSDBFile.get("filename");
        String PsgName = (String) gridFSDBFile.get("nameOfPassenger");
        String PsgID = (String) gridFSDBFile.get("idNo");
        String ETicketNo = (String) gridFSDBFile.get("eTicketNo");
        String loacl1 = (String) gridFSDBFile.get("PsgName_Local");
        String loacl2 = (String) gridFSDBFile.get("PsgID_Local");
        String loacl3 = (String) gridFSDBFile.get("ETicket_Local");

        eTicketInfo.setNameOfPic(nameOfPic);
        eTicketInfo.setPsgName(PsgName);
        eTicketInfo.setPsgID(PsgID);
        eTicketInfo.setETicketNo(ETicketNo);
        eTicketInfo.setPsgnamelocal(loacl1);
        eTicketInfo.setPsgidlocal(loacl2);
        eTicketInfo.setEticketlocal(loacl3);
//        System.out.println("eTicketInfo:"+eTicketInfo);

        List<String> eTicketInfolist = new ArrayList<String>();
        eTicketInfolist.add(eTicketInfo.getNameOfPic());
        eTicketInfolist.add(eTicketInfo.getPsgName());
        eTicketInfolist.add(eTicketInfo.getPsgID());
        eTicketInfolist.add(eTicketInfo.getETicketNo());
        eTicketInfolist.add(eTicketInfo.getPsgnamelocal());
        eTicketInfolist.add(eTicketInfo.getPsgidlocal());
        eTicketInfolist.add(eTicketInfo.getEticketlocal());
//        System.out.println("eTicketInfolist:"+eTicketInfolist);
        response.setCharacterEncoding("utf-8");
        PrintWriter pw = response.getWriter();
        String rowsJson = JsonUtil.list2json(eTicketInfolist);
        String json = "{\"json\":" + rowsJson + "}";
        pw.print(json);
//        return eTicketInfolist;
    }


//    for-each列表展示
//    @RequestMapping("mongoDBOriginCollection")
//    public String mongoDBOriginCollection(HttpServletRequest request, HttpServletResponse response, Model model){
//        MongoClient client = new MongoClient("192.168.1.109", 27017);
//        DB db = client.getDB("runoobdb");
//        List<String> eTicketInfolist = findOriginArray();
//        GridFS gridFS = new GridFS(db,"fs");
//        List<MongoDBConnection> MongoDBConnectionList = new ArrayList<MongoDBConnection>();
//        for (int i=0;i<eTicketInfolist.size();i++){
//            GridFSDBFile gridFSDBFile = gridFS.findOne(new ObjectId(eTicketInfolist.get(i)));
//            String filename = (String) gridFSDBFile.get("filename");
//            String nameOfPassenger = (String) gridFSDBFile.get("nameOfPassenger");
//            String idNo = (String) gridFSDBFile.get("idNo");
//            String eTicketNo = (String) gridFSDBFile.get("eTicketNo");
//            String PsgName_CN_Label = (String) gridFSDBFile.get("PsgName_CN_Label");
//            String PsgName_EN_Label = (String) gridFSDBFile.get("PsgName_EN_Label");
//            String PsgID_CN_Label = (String) gridFSDBFile.get("PsgID_CN_Label");
//            String PsgID_EN_Label = (String) gridFSDBFile.get("PsgID_EN_Label");
//            String ETicketNo_CN_Label = (String) gridFSDBFile.get("ETicketNo_CN_Label");
//            String ETicketNo_EN_Label = (String) gridFSDBFile.get("ETicketNo_EN_Label");
//            String ETicket_Alias = (String) gridFSDBFile.get("ETicket_Alias");
//            String PsgName_local = (String) gridFSDBFile.get("PsgName_local");
//            String PsgID_local = (String) gridFSDBFile.get("PsgID_local");
//            String ETicket_local = (String) gridFSDBFile.get("ETicket_local");
//
//            MongoDBConnection MongoDBConnection = new MongoDBConnection();
//            MongoDBConnection.set_id(eTicketInfolist.get(i));
//            MongoDBConnection.setFilename(filename);
//            MongoDBConnection.setNameOfPassenger(nameOfPassenger);
//            MongoDBConnection.setIdNo(idNo);
//            MongoDBConnection.seteTicketNo(eTicketNo);
//            MongoDBConnection.setNameOfPassenger_CN_Label(PsgName_CN_Label);
//            MongoDBConnection.setNameOfPassenger_EN_Label(PsgName_EN_Label);
//            MongoDBConnection.setID_CN_Label(PsgID_CN_Label);
//            MongoDBConnection.setID_EN_Label(PsgID_EN_Label);
//            MongoDBConnection.setETicketNo_CN_Label(ETicketNo_CN_Label);
//            MongoDBConnection.setETicketNo_EN_Label(ETicketNo_EN_Label);
//            MongoDBConnection.setETicket_Alias(ETicket_Alias);
//            MongoDBConnection.setNameLocal(PsgName_local);
//            MongoDBConnection.setIDLocal(PsgID_local);
//            MongoDBConnection.setETicket_local(ETicket_local);
//
//            MongoDBConnectionList.add(MongoDBConnection);
//        }
//        System.out.println("MongoDBConnectionList:"+MongoDBConnectionList);
//        model.addAttribute("MongoDBConnectionList",MongoDBConnectionList);
//        return "Gui/JKPT/mongoDBOriginCollection";
//    }
//    public List<String> findOriginArray() {
//        String laststr = "";
//        MongoClient client = new MongoClient("192.168.1.109",27017);
//        DB db = client.getDB("runoobdb");
//        DBCollection coll = db.getCollection("fs.files");
//        DBCursor find = coll.find();
//        List<String> eTicketInfolist = new ArrayList<>();
//        while (find.hasNext()) {
//            laststr += find.next();
//            eTicketInfolist.add(laststr.substring(22,46));
//            laststr = "";
//        }
//        return eTicketInfolist;
//    }

    @RequestMapping("MongoDBPicRotateInfo")
    public String MongoDBPicRotate(HttpServletRequest request, HttpServletResponse response,@RequestParam String id){
        //获取到前台mongoDBOriginList.jsp中src拼接的id
        request.getSession().setAttribute("pic_rotate_id",id);
        return "AI/MongoDBPicRotateInfo";
    }

    @RequestMapping("MongoDBPicInfo_rotate")
    public void MongoDBPicInfo_rotate(HttpServletRequest request, HttpServletResponse response,@RequestParam String value){
        try{
                String id = (String)request.getSession().getAttribute("pic_rotate_id");
//                String value = request.getParameter("value");
                request.getSession().setAttribute("value",value);
                if(request.getParameter("value")!=null){
                    String regex=value.substring(6,value.indexOf("_"));
                    String bucket = "originRotate_"+regex;
                    MongoClient client = new MongoClient("192.168.1.109",27017);
                    DB db = client.getDB("BTW_MU_AI");
                    GridFS gridFS = new GridFS(db,"fs");
                    GridFS gridFS1 = new GridFS(db,bucket);
                    GridFSDBFile gridFSDBFile = (GridFSDBFile)gridFS.findOne(new ObjectId(id));
                    String Rotate_id = (String) gridFSDBFile.get(value);
                    GridFSDBFile gridFSDBFile1 = (GridFSDBFile)gridFS1.findOne(new ObjectId(Rotate_id));
                    if (gridFSDBFile1 != null) {
                        OutputStream sos = response.getOutputStream();
                        response.setContentType("application/octet-stream");
                        gridFSDBFile1.writeTo(sos);
                        sos.flush();
                        sos.close();
                    }
                }
            }catch(Exception e){
                e.printStackTrace();
            }

//        try{
//            String id = "5dde5c7d5ca47dd5e8f94525";
//
//            MongoClient client = new MongoClient("192.168.1.109",27017);
//            DB db = client.getDB("BTW_MU_AI");
//            GridFS gridFS = new GridFS(db,"originRotate_45°");
//
//            GridFSDBFile gridFSDBFile = (GridFSDBFile)gridFS.findOne(new ObjectId(id));
//
//            if (gridFSDBFile != null) {
//                OutputStream sos = response.getOutputStream();
//                response.setContentType("application/octet-stream");
//                gridFSDBFile.writeTo(sos);
//                sos.flush();
//                sos.close();
//            }
//        }catch(Exception e){
//            e.printStackTrace();
//        }
    }

    @RequestMapping("rotateImg_Information")
    @ResponseBody
    public void rotateImg_Information(HttpServletRequest request, HttpServletResponse response) throws IOException {

        MongoClient client = new MongoClient("192.168.1.109",27017);
        DB db = client.getDB("BTW_MU_AI");
        GridFS gridFS = new GridFS(db,"fs");
        GridFS gridFS1 = new GridFS(db,"cutPic");
        String value = request.getParameter("value");
        String id = (String)request.getSession().getAttribute("pic_rotate_id");
        GridFSDBFile gridFSDBFile = (GridFSDBFile)gridFS.findOne(new ObjectId(id));

        String PsgName_id = (String) gridFSDBFile.get("PsgName_id");
        GridFSDBFile gridFSDBFile1 = (GridFSDBFile)gridFS1.findOne(new ObjectId(PsgName_id));
        String PsgID_id = (String) gridFSDBFile.get("PsgID_id");
        GridFSDBFile gridFSDBFile2 = (GridFSDBFile)gridFS1.findOne(new ObjectId(PsgID_id));
        String ETicket_id = (String) gridFSDBFile.get("ETicket_id");
        GridFSDBFile gridFSDBFile3 = (GridFSDBFile)gridFS1.findOne(new ObjectId(ETicket_id));

        ETicketInfo eTicketInfo = new ETicketInfo();

        String nameOfPic = (String) gridFSDBFile.get("filename");
        String PsgName = (String) gridFSDBFile.get("nameOfPassenger");
        String PsgID = (String) gridFSDBFile.get("idNo");
        String ETicketNo = (String) gridFSDBFile.get("eTicketNo");


        if(value!=null) {
            String regex = value.substring(6, value.indexOf("_"));
            String loacl1 = (String) gridFSDBFile1.get("rotate"+regex+"PsgName_Local");
            String loacl2 = (String) gridFSDBFile2.get("rotate"+regex+"PsgID_Local");
            String loacl3 = (String) gridFSDBFile3.get("rotate"+regex+"ETicketNo_Local");
            eTicketInfo.setNameOfPic(nameOfPic);
            eTicketInfo.setPsgName(PsgName);
            eTicketInfo.setPsgID(PsgID);
            eTicketInfo.setETicketNo(ETicketNo);
            eTicketInfo.setPsgnamelocal(loacl1);
            eTicketInfo.setPsgidlocal(loacl2);
            eTicketInfo.setEticketlocal(loacl3);
//        System.out.println("eTicketInfo:"+eTicketInfo);

            List<String> eTicketInfolist = new ArrayList<String>();
            eTicketInfolist.add(eTicketInfo.getNameOfPic());
            eTicketInfolist.add(eTicketInfo.getPsgName());
            eTicketInfolist.add(eTicketInfo.getPsgID());
            eTicketInfolist.add(eTicketInfo.getETicketNo());
            eTicketInfolist.add(eTicketInfo.getPsgnamelocal());
            eTicketInfolist.add(eTicketInfo.getPsgidlocal());
            eTicketInfolist.add(eTicketInfo.getEticketlocal());
//        System.out.println("eTicketInfolist:"+eTicketInfolist);
            response.setCharacterEncoding("utf-8");
            PrintWriter pw = response.getWriter();
            String rowsJson = JsonUtil.list2json(eTicketInfolist);
            String json = "{\"json\":" + rowsJson + "}";
            pw.print(json);
//        return eTicketInfolist;
        }

//        后台取ajax中的data
//        String value = request.getParameter("value");
//        String test = request.getParameter("test");
//        List<String> arr = new  ArrayList<String>();
//        arr.add(value);
//        arr.add(test);
//        response.setCharacterEncoding("utf-8");
//        PrintWriter pw = response.getWriter();
//        String rowsJson = JsonUtil.list2json(arr);
//        String json = "{\"json\":" + rowsJson + "}";
//        pw.print(json);
    }

    @RequestMapping("MongoDBPicGaoSiInfo")
    public String MongoDBPicGaoSiInfo(HttpServletRequest request, HttpServletResponse response,@RequestParam String id){
        //获取到前台mongoDBOriginList.jsp中src拼接的id
        request.getSession().setAttribute("pic_gaosi_id",id);
        return "AI/MongoDBPicGaoSiInfo";
    }

    @RequestMapping("MongoDBPicInfo_gaosi")
    public void MongoDBPicInfo_gaosi(HttpServletRequest request, HttpServletResponse response,@RequestParam String gaositext,@RequestParam String gaosivalue){
        try{
            String id = (String)request.getSession().getAttribute("pic_gaosi_id");
            request.getSession().setAttribute("gaositext",gaositext);
            request.getSession().setAttribute("gaosivalue",gaosivalue);
            if(gaositext!=null){
                String bucket = "origin"+gaositext;
                MongoClient client = new MongoClient("192.168.1.109",27017);
                DB db = client.getDB("BTW_MU_AI");
                GridFS gridFS = new GridFS(db,"fs");
                GridFS gridFS1 = new GridFS(db,bucket);
                GridFSDBFile gridFSDBFile = (GridFSDBFile)gridFS.findOne(new ObjectId(id));
                String GaoSi_id = (String) gridFSDBFile.get(gaosivalue);
                GridFSDBFile gridFSDBFile1 = (GridFSDBFile)gridFS1.findOne(new ObjectId(GaoSi_id));
                if (gridFSDBFile1 != null) {
                    OutputStream sos = response.getOutputStream();
                    response.setContentType("application/octet-stream");
                    gridFSDBFile1.writeTo(sos);
                    sos.flush();
                    sos.close();
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @RequestMapping("gaoSiImg_Information")
    @ResponseBody
    public void gaoSiImg_Information(HttpServletRequest request, HttpServletResponse response) throws IOException {

        MongoClient client = new MongoClient("192.168.1.109",27017);
        DB db = client.getDB("BTW_MU_AI");
        GridFS gridFS = new GridFS(db,"fs");

        String id = (String)request.getSession().getAttribute("pic_gaosi_id");

        GridFSDBFile gridFSDBFile = (GridFSDBFile)gridFS.findOne(new ObjectId(id));

        ETicketInfo eTicketInfo = new ETicketInfo();

        String nameOfPic = (String) gridFSDBFile.get("filename");
        String PsgName = (String) gridFSDBFile.get("nameOfPassenger");
        String PsgID = (String) gridFSDBFile.get("idNo");
        String ETicketNo = (String) gridFSDBFile.get("eTicketNo");
        String loacl1 = (String) gridFSDBFile.get("PsgName_Local");
        String loacl2 = (String) gridFSDBFile.get("PsgID_Local");
        String loacl3 = (String) gridFSDBFile.get("ETicket_Local");

        eTicketInfo.setNameOfPic(nameOfPic);
        eTicketInfo.setPsgName(PsgName);
        eTicketInfo.setPsgID(PsgID);
        eTicketInfo.setETicketNo(ETicketNo);
        eTicketInfo.setPsgnamelocal(loacl1);
        eTicketInfo.setPsgidlocal(loacl2);
        eTicketInfo.setEticketlocal(loacl3);

        List<String> eTicketInfolist = new ArrayList<String>();
        eTicketInfolist.add(eTicketInfo.getNameOfPic());
        eTicketInfolist.add(eTicketInfo.getPsgName());
        eTicketInfolist.add(eTicketInfo.getPsgID());
        eTicketInfolist.add(eTicketInfo.getETicketNo());
        eTicketInfolist.add(eTicketInfo.getPsgnamelocal());
        eTicketInfolist.add(eTicketInfo.getPsgidlocal());
        eTicketInfolist.add(eTicketInfo.getEticketlocal());
        response.setCharacterEncoding("utf-8");
        PrintWriter pw = response.getWriter();
        String rowsJson = JsonUtil.list2json(eTicketInfolist);
        String json = "{\"json\":" + rowsJson + "}";
        pw.print(json);
//        return eTicketInfolist;
    }

    @RequestMapping("originalDataImport")
    public String originalDataImport(HttpServletRequest request, HttpServletResponse response, Model model){
        return "AI/originalDataImport";
    }

    @RequestMapping("originalDataPreview")
    public String originalDataPreview(HttpServletRequest request, HttpServletResponse response, Model model){
        return "AI/originalDataPreview";
    }

    @RequestMapping("originalDataPreprocessing")
    public String originalDataPreprocessing(HttpServletRequest request, HttpServletResponse response, Model model){
        return "AI/originalDataPreprocessing";
    }

    @RequestMapping("supervisionInfoPreview")
    public String supervisionInfoPreview(HttpServletRequest request, HttpServletResponse response, Model model){
        return "AI/supervisionInfoPreview";
    }

    @RequestMapping("dataExport")
    public String dataExport(HttpServletRequest request, HttpServletResponse response, Model model){
        return "AI/dataExport";
    }

    @RequestMapping("ETicketsInterfaceManage")
    public String ETicketsInterfaceManage(HttpServletRequest request, HttpServletResponse response, Model model){
        return "AI/ETicketsInterfaceManage";
    }

    @RequestMapping("algorithmRecognitionLibrary")
    public String algorithmRecognitionLibrary(HttpServletRequest request, HttpServletResponse response, Model model){
        return "AI/algorithmRecognitionLibrary";
    }

    @RequestMapping("trainProcessManage")
    public String trainProcessManage(HttpServletRequest request, HttpServletResponse response, Model model){
        return "AI/trainProcessManage";
    }

    @RequestMapping("testProcessManage")
    public String testProcessManage(HttpServletRequest request, HttpServletResponse response, Model model){
        return "AI/testProcessManage";
    }

    @RequestMapping("trainProcessLogManage")
    public String trainProcessLogManage(HttpServletRequest request, HttpServletResponse response, Model model){
        return "AI/trainProcessLogManage";
    }

    @RequestMapping("visualTestPage")
    public String visualTestPage(HttpServletRequest request, HttpServletResponse response, Model model){
        return "AI/visualTestPage";
    }

    @RequestMapping("userAuthorityLimitManage")
    public String userAuthorityLimitManage(HttpServletRequest request, HttpServletResponse response, Model model){
        return "AI/userAuthorityLimitManage";
    }

}


