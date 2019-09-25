package com.aspose.cloud.cells.api;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.aspose.cloud.cells.client.ApiClient;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.model.AccessTokenResponse;


public class CellsApiUtil {
	private static String grantType = "client_credentials";
	private static String clientId = "66164C51-693E-4904-A121-545961673EC1";//"";
	private static String clientSecret =  "536e76768419db9585afdd37bb5f7533";//"";
	private static String sourceFolder ="/sdcard/Download/TestData/TestData/";
	public static String GetSourceFolder() {
		return sourceFolder;
	}
	public static String GetGrantType() {
		return grantType;
	}

	public static String GetClientId() {
		return clientId;
	}

	public static String GetClientSecret() {
		return clientSecret;
	}

	
	public static void Upload(CellsApi cellsApi,String folder ,String filename) {		
		File file = new File(sourceFolder + filename);
		try {
			cellsApi.uploadFile(folder +"\\" + filename, file, null);
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	public static void Upload(CellsApi cellsApi,String filename) {		
		File file = new File(sourceFolder + filename);
		try {
			cellsApi.uploadFile( filename, file, null);
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	public static byte[] GetFileData(String filename)	{		
        try {  
            File file = new File(GetSourceFolder() + filename);  
            FileInputStream fis = new FileInputStream(file);  
            ByteArrayOutputStream bos = new ByteArrayOutputStream(1000);  
            byte[] b = new byte[1000];  
            int n;  
            while ((n = fis.read(b)) != -1) {  
                bos.write(b, 0, n);  
            }  
            fis.close();  
            bos.close();  
            return bos.toByteArray();  
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }
		return null;  
	}
	
}
