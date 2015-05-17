package com.example.asier.insertarimagenbbdd;


import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;

public class ImageAdapter extends ArrayAdapter<Contacto> {
	 Context context;
	    int layoutResourceId;
	   // BcardImage data[] = null;
	    ArrayList<Contacto> data=new ArrayList<Contacto>();
	    public ImageAdapter(Context context, int layoutResourceId, ArrayList<Contacto> data) {
	        super(context, layoutResourceId, data);
	        this.layoutResourceId = layoutResourceId;
	        this.context = context;
	        this.data = data;
	    }

	    @Override
	    public View getView(int position, View convertView, ViewGroup parent) {
	        View row = convertView;
	        ImageHolder holder = null;
	       
	        if(row == null)
	        {
	            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
	            row = inflater.inflate(layoutResourceId, parent, false);
	           
	            holder = new ImageHolder();
	            holder.imgIcon = (ImageView)row.findViewById(R.id.imgIcon);
	            row.setTag(holder);
	        }
	        else
	        {
	            holder = (ImageHolder)row.getTag();
	        }
	       
	        Contacto picture = data.get(position);
	        //convert byte to bitmap take from contact class
	        
	        byte[] outImage=picture._image;
	        ByteArrayInputStream imageStream = new ByteArrayInputStream(outImage);
	        Bitmap theImage = BitmapFactory.decodeStream(imageStream);
	        holder.imgIcon.setImageBitmap(theImage);
	       return row;
	       
	    }
	   
	    static class ImageHolder
	    {
	        ImageView imgIcon;
	    }
	}
