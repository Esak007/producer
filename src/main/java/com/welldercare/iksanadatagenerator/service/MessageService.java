package com.welldercare.iksanadatagenerator.service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;


import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.springframework.stereotype.Service;

import com.welldercare.iksanadatagenerator.model.Message;
import com.welldercare.iksanadatagenerator.util.CommonUtil;

@Service
public class MessageService {

	public Message messageSave(Message t, String topic) throws IOException {
	
		
		 
		try {
		    String username="iotdevices";
		    String password="Weldercare@321";
		//	ByteArrayOutputStream bos = new ByteArrayOutputStream();  
			
		    String msg=t.toString();
		    System.err.println(msg);
			MqttClient client = new MqttClient(CommonUtil.getMQTT_SERVER_CONNECTION_URL(), MqttClient.generateClientId());
			MqttConnectOptions options=new MqttConnectOptions();
			options.setUserName(username);
			options.setPassword(password.toCharArray());
			client.connect(options);
			MqttMessage message = new MqttMessage();
			message.setPayload(msg.getBytes());
			message.setQos(0);
			message.setRetained(false);
			client.publish(topic, message);
			
			client.disconnect();
		} catch (MqttException e) {
			e.printStackTrace();
		}
		return t;
	}
}
