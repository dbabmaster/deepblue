package com.deepblue.video;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Node;
import com.deepblue.web.Media;

public class VideoUploadBizComp {
	public  List getMediaList(){
			List mediaList2= new ArrayList();
			for (int i=0; i < 10; ++i) {
				Media media= new Media();
				media.setId(new Integer(i).toString());
				media.setName("Entry number" + i );
				media.setDescription("Entry description" + i);
				mediaList2.add(media);
			}
			return mediaList2;
		}
}
