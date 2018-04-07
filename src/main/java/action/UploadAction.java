package action;

import java.io.File;
import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;


/**
 * 文件上传
 */
public class UploadAction extends BaseAction
{

    //表单上提供的字段
    private File myfile;
    //struts2在文件上传时提供的属性
    private String myfileFileName;//上传的文件名。上传字段名称+FileName  注意大小写
    private String myfileContentType;//上传文件的MIME类型。上传字段名称+ContentType 注意大小写

    public String upload()
    {

        //1.拿到ServletContext
        ServletContext servletContext =  ServletActionContext.getServletContext();
        //2.调用realPath方法，获取根据一个虚拟目录得到的真实目录
        String realPath = servletContext.getRealPath("/WEB-INF/file");
        //3.如果这个真实的目录不存在，需要创建
        File file = new File(realPath);
        if (!file.exists())
        {
            file.mkdirs();
        }

        //剪切：把临时文件剪切指定的位置，并且给他重命名。
        myfile.renameTo(new File(file, myfileFileName));
        return SUCCESS;
    }

    public File getMyfile()
    {
        return myfile;
    }

    public void setMyfile(File myfile)
    {
        this.myfile = myfile;
    }

    public String getMyfileFileName()
    {
        return myfileFileName;
    }

    public void setMyfileFileName(String myfileFileName)
    {
        this.myfileFileName = myfileFileName;
    }

    public String getMyfileContentType()
    {
        return myfileContentType;
    }

    public void setMyfileContentType(String myfileContentType)
    {
        this.myfileContentType = myfileContentType;
    }

}
