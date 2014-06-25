package com.anucana.services;

import java.util.List;

import com.anucana.client.data.IClientDetails;
import com.anucana.service.contracts.ServiceException;
import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.user.data.IUserDetails;
import com.anucana.value.objects.ImageOps;

public interface IMultimediaService {

	public ServiceResponse<List<ImageOps>> getImages(ServiceRequest<List<ImageOps>> request, IUserDetails userDetails,IClientDetails client) throws ServiceException;
	
	public ServiceResponse<ImageOps> saveImage(ServiceRequest<ImageOps> request, IUserDetails userDetails,IClientDetails client) throws ServiceException;
	
	public ServiceResponse<ImageOps> cropImage(ServiceRequest<ImageOps> request, IUserDetails userDetails,IClientDetails client) throws ServiceException;
	
}
