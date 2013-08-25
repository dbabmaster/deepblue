package com.deepblue.web.controller;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartFile;

import com.deepblue.web.Media;
import com.deepblue.web.Player;

import javax.servlet.http.HttpServletRequest;

import com.deepblue.video.VideoUploadBizComp;
import com.deepblue.report.ReportBizComp;
import org.apache.log4j.Logger;

@Controller
@RequestMapping("/")
public class DeepBlueBaseController {

	private static final Logger logger = Logger.getLogger(DeepBlueBaseController.class);
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(ModelMap model) {
		//logger.info("Control in list method ...");
		VideoUploadBizComp mediaUploadBizComp= new VideoUploadBizComp();
		model.addAttribute("mediaEntries",mediaUploadBizComp.getMediaList());
		// Spring uses InternalResourceViewResolver and return back index.jsp
		return "list";

	}
	
	@RequestMapping(value = "/demolist", method = RequestMethod.GET)
	public String demolist(ModelMap model) {
		//logger.info("Control in list method ...");
		VideoUploadBizComp mediaUploadBizComp= new VideoUploadBizComp();
		model.addAttribute("mediaEntries",mediaUploadBizComp.getMediaList());
		// Spring uses InternalResourceViewResolver and return back index.jsp
		return "list";

	}
	
	

	@RequestMapping(value = "/report/topcontent", method = RequestMethod.GET)
	public String playerlist(@RequestParam("mediaIds") String mediaIds,ModelMap model) throws Exception  {
		logger.info("Control in playerlist method ...");
		ReportBizComp reportBizComp= new ReportBizComp();
		//KalturaReportTotal reportTotal=reportBizComp.getTopContent(mediaIds);
		String headerDataString="Top Media, Views, Total views, Unique visitors, Total Traffic";
		String reportDataString="10,20,30,40,50";
		String[] headerData = headerDataString.split(",");
		String[] reportData = reportDataString.split(",");
		
		
		model.addAttribute("headerData",Arrays.asList(headerData));
		model.addAttribute("reportData",Arrays.asList(reportData));
		// Spring uses InternalResourceViewResolver and return back index.jsp
		return "report";

	}
	
	
	
	/*
	@RequestMapping(value = "/playerlist", method = RequestMethod.GET)
	public String playerlist(ModelMap model) throws Exception  {
		VideoUploadBizComp mediaUploadBizComp= new VideoUploadBizComp();
		KalturaUiConfListResponse mediaList=mediaUploadBizComp.getPlayerList();
		List mediaList2= new ArrayList();
		for (int i=0; i < mediaList.objects.size(); ++i) {
			KalturaUiConf entry=mediaList.objects.get(i);
			Player media= new Player();
			media.setId(new Integer(entry.id).toString());
			media.setName(entry.name);
			media.setDescription(entry.description);
			media.setHeight(new Integer(entry.height));
			media.setWidth(new Integer(entry.width));
			mediaList2.add(media);
		}
		model.addAttribute("players",mediaList2);
		// Spring uses InternalResourceViewResolver and return back index.jsp
		return "players";

	}
	
	
	
	
	@RequestMapping(value = "/player/view/", method = RequestMethod.GET)
	public String playerView(@RequestParam("id") String id,ModelMap model)  throws Exception {
		VideoUploadBizComp mediaUploadBizComp= new VideoUploadBizComp();
		KalturaUiConf player =mediaUploadBizComp.getPlayerById(new Integer(id).intValue());
			Player media= new Player();
			media.setId(new Integer(player.id).toString());
			media.setName(player.name);
			media.setDescription(player.description);
			media.setHeight(new Integer(player.height));
			media.setWidth(new Integer(player.width));
			media.setWatermarkPath(mediaUploadBizComp.getWatermarkPath(player));

		model.addAttribute("player",media);
		// Spring uses InternalResourceViewResolver and return back index.jsp
		return "player";

	}
	
	
	@RequestMapping(value = "/player/edit", method = RequestMethod.POST)
	public String playerEdit(@RequestParam("id") String id,
			@RequestParam("width") Integer width,
			@RequestParam("height") Integer height,
			@RequestParam("watermarkPath") String watermarkPath,ModelMap model)  throws Exception {
		VideoUploadBizComp mediaUploadBizComp= new VideoUploadBizComp();
		KalturaUiConf entry =mediaUploadBizComp.getPlayerById(new Integer(id).intValue());
		entry.height=height.intValue();
		entry.width=width.intValue();
		
        mediaUploadBizComp.updatePlayerWaterMark(entry, watermarkPath);
		
		Player media= new Player();
			media.setId(new Integer(entry.id).toString());
			media.setName(entry.name);
			media.setDescription(entry.description);
			media.setHeight(new Integer(entry.height));
			media.setWidth(new Integer(entry.width));
			media.setWatermarkPath(mediaUploadBizComp.getWatermarkPath(entry));
		model.addAttribute("player",media);
		// Spring uses InternalResourceViewResolver and return back index.jsp
		return "player";

	}
	*/
	
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome(ModelMap model) {

		
		model.addAttribute("message",
				"Maven Web Project + Spring 3 MVC - welcome()");

		// Spring uses InternalResourceViewResolver and return back index.jsp
		return "index";

	}

	@RequestMapping(value = "/welcome/{name}", method = RequestMethod.GET)
	public String welcomeName(@PathVariable String name, ModelMap model) {

		model.addAttribute("message", "Maven Web Project + Spring 3 MVC - "
				+ name);
		return "index";

	}
	
	

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String handleFormUpload(@RequestParam("name") String name,
        @RequestParam("file") MultipartFile file)  throws Exception{
        if (!file.isEmpty()) {
        	 VideoUploadBizComp mediaUploadBizComp= new VideoUploadBizComp();
    	     //mediaUploadBizComp.uploadVideo(file.getInputStream());
            //byte[] bytes = file.getBytes();
            // store the bytes somewhere
            //System.err.println("Bytes size is:" + bytes);
        	return "index2";
       } else {
    		return "index";
       }
    }

}
