package in.co.rays.proj4.controller;

import jakarta.servlet.annotation.WebServlet;

import in.co.rays.proj4.model.BaseModel;

@WebServlet("/WelcomeCtl")
public class WelcomeCtl extends BaseCtl {

	@Override
	public BaseModel getModel() {
		return null;
	}

	@Override
	public String getView() {
		return ORSView.WELCOME_VIEW;
	}

}
