package com.assignment2.app;

public class box {
	float width, height,depth;
	box(){
		width= 0.0f;
		height= 0.0f;
		depth=0.0f;		
	}
	box(float width, float height, float depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	public float volumePassed(float width, float height, float depth) {
		return width*depth*height;
	}
	public float volume() {
		return width*depth*height;
	}

}
