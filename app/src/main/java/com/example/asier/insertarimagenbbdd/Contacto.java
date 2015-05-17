package com.example.asier.insertarimagenbbdd;

public class Contacto {

	// private variables
	int _id;
	byte[] _image;

	// Empty constructor
	public Contacto() {

	}

	// constructor
	public Contacto(int keyId, byte[] image) {
		this._id = keyId;
		this._image = image;

	}
	public Contacto(byte[] image) {
		this._image = image;

	}
	public Contacto(int keyId) {
		this._id = keyId;

	}

	// getting ID
	public int getID() {
		return this._id;
	}

	// setting id
	public void setID(int keyId) {
		this._id = keyId;
	}

	// getting phone number
	public byte[] getImage() {
		return this._image;
	}

	// setting phone number
	public void setImage(byte[] image) {
		this._image = image;
	}
}
