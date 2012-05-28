package com.trevorpage.tpsvg_example1;

import com.trevorpage.tpsvg.SVGFlyweightFactory;
import com.trevorpage.tpsvg.SVGView;
import com.trevorpage.tpsvg.Tpsvg;
import com.trevorpage.tpsvg.Tpsvg.SvgStyle;
import com.trevorpage.tpsvg.Tpsvg.Textstring;

import android.app.Activity;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;

public class TPSVG_Example1Activity extends Activity implements com.trevorpage.tpsvg.ItpsvgAnim {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.main);
        SVGView svgView = (SVGView)this.findViewById(R.id.svgImage);
        svgView.setImageResource(R.raw.anime, this);
        svgView.setBackgroundColor(0xff123456);
    }

    
    
	public boolean animElement(String id, int iteration, Matrix matrix,
			Paint sroke, Paint fill) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean animTextElement(String id, int iteration, Matrix matrix,
			SvgStyle style, Textstring text, float x, float y) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean arcParams(String id, Path path, float startAngle,
			float sweepAngle, RectF bounds) {
		// TODO Auto-generated method stub
		return false;
	}
}