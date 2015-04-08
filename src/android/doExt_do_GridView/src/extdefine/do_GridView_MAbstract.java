package extdefine;

import core.object.DoUIModule;
import core.object.DoProperty;
import core.object.DoProperty.PropertyDataType;


public abstract class do_GridView_MAbstract extends DoUIModule{

	protected do_GridView_MAbstract() throws Exception {
		super();
	}
	
	/**
	 * 初始化
	 */
	@Override
	public void onInit() throws Exception{
        super.onInit();
        //注册属性
		this.registProperty(new DoProperty("hSpacing", PropertyDataType.Number, "", true));
		this.registProperty(new DoProperty("isShowbar", PropertyDataType.Bool, "true", true));
		this.registProperty(new DoProperty("numColumns", PropertyDataType.Number, "", true));
		this.registProperty(new DoProperty("selectedColor", PropertyDataType.String, "", true));
		this.registProperty(new DoProperty("vSpacing", PropertyDataType.Number, "", true));
		this.registProperty(new DoProperty("cellTemplates", PropertyDataType.String, "", true));
	}
}