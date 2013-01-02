package com.trevorpage.tpsvg_example1;

import com.trevorpage.tpsvg.SVGParserRenderer;
import com.trevorpage.tpsvg.SVGView;
import android.app.Activity;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;

public class TPSVG_Example1Activity extends Activity implements com.trevorpage.tpsvg.ITpsvgController {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.main);
        SVGView svgView = (SVGView)this.findViewById(R.id.svgImage);
        SVGParserRenderer image = new SVGParserRenderer(this, R.raw.anime);
        svgView.setSVGRenderer(image, null);
        svgView.setBackgroundColor(0xff123456);
    }

    
    
	public boolean animElement(String id, int iteration, Matrix matrix, Paint sroke, Paint fill) {
		return false;
	}

	public boolean arcParams(String id, Path path, float startAngle, float sweepAngle, RectF bounds) {
		return false;
	}

	public boolean animTextElement(String id, int iteration, Matrix matrix,
			com.trevorpage.tpsvg.SVGParserRenderer.SvgStyle style,
			com.trevorpage.tpsvg.SVGParserRenderer.Textstring text, float x,
			float y) {
		return false;
	}

	public void setSourceDocumentWidth(int width) {
		
	}

	public void setSourceDocumentHeight(int height) {
		
	}

	public void onSVGPrivateData(String key, String value) {

	}

	public void setRemainderWidthOrHeight(float remainderWidth, float remainderHeight) {

	}
}