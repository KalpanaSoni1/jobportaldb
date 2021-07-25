package com.example.jobportaldb.Utils;

public class AppConstant {

	public static final String androidFcmKey = "key=AAAA1uzfpPI:APA91bEpJxbQ17LslnDOgIqVdRIK53JuaMFIEKkUqYGB8Omb61XTCxZdV1G5F05EgjP21zr0Wg15bhiKhHbIesXlvVc3y5_uQZxHouOlqZXZPMYzvjDiZJs5iVmoqAu5ySG8WeU6z9CM";

	public static final String apiUrl = "http://localhost:8082/"; // for local

	// public static final String apiUrl= "http://103.55.91.195:8082/usermod/";

	public static final String AUTHENTICATION_ERROR = "Invalid access";
	
	public static final String DELETE_MSG = "Deleted Successfully";
	
	public static final String SUCCESS_API_MESSGAE = "Successfully Fetched";
	
	 public static final String ERROR_API_MESSAGE ="Error";

	 public static final String NO_DATA = "data is not present"; 

	public static final String SERVER_ERROR = "Server error";

	public static final String TOKEN_EXPIRE = "JWT Token Expired !";
	
	public static final String ERROR_SAVINGDATA = "Error While Saving";
	
	public static final String ERROR_UPDATINGDATA = "Error While Saving";
	
	public final static String FUNCTIONKEY_ERROR = "Function key does not exist";
	
	public final static String FUNCTIONKEY_MISMATCH = "Function key does not macthed";
	
    public static final String VIOLATION_RKEY ="rkey.violationdemo";

    public static final String DEVICEMOD_KEY ="rkey.devicemod";
    
    public static final String NO_RECORD_FOUND ="No Record found";
    
    public static final String LOGIN_SUCCESS_MSG = "Successfully loggedin";
	// password attempts
	public static final int PASSWORD_ATTEMPTS = 7;
	// URL to send notification for FCM
	public static final String androidFcmUrl = "http://fcm.googleapis.com/fcm/send";

	public final static String SERVER_URL = "http://172.22.202.51:8080/";
	public final static boolean isLocalHost = true;

	/** OPENSTREETMAP URL **/
	public final static String OPEN_STREET_URL = "https://nominatim.openstreetmap.org/";
	public final static int RECORD_LIMIT = 1000;
	// Status code
	public final static int SUCCESS_STATUS_CODE = 1;
	public final static int ERROR_STATUS_CODE = 0;
	public static final int ERROR = 11;
	public static final int INFO = 12;
	public static final int DEBUG = 13;
	public final static int INVALID_ACCESS_CODE = 4;

	public static final String WINDOW = "Window";
	public static final String LINUX = "Linux";

	// Directories
	public final static String CONFIG_DIRECTORY = "config";
	public final static String ROOT_DIRECTORY = "Maatica-Desk";
	public final static String MOBLIE_ROOT_DIRECTORY = "Mobile-Dir";
	public final static String WEB_ROOT_DIRECTORY = "Web-Dir";

	public final static String LOG_DIRECTORY = "log";
	public final static String USER_LOG_DIRECTORY = "Userlog";
	public final static String LICENSE_DIRECTORY = "License";
	public final static String VIDEO_DIRECTORY = "Video";

	public final static int TOKKEN_SIZE = 10;
	public static final String AES_KEY = "B374A26A71490437AA024E4FADD5B497FDFF1A8EA6FF12F6FB65AF2720B59CCF";

	// User's log key
	public final static int PASSWORD_CHANGE_LOG = 31;
	public final static int LOGIN_LOG = 32;
	public final static int LOGOUT_LOG = 33;

	/** VIOLATION SOURCE **/
	public final static String SOURCE_WEB = "Web";
	public final static String SOURCE_MOBILE = "Mobile";

	public final static boolean IS_CLOUD = false;
	public static final String EMAIL = "nikhoney27@gmail.com";

	public final static long flag = 1;
	public static boolean IS_BLACKLIST_REQUEST = true;
	public final static boolean IS_VIDEO_REQUEST = false;

	public static final boolean ENABLE_MOBILE_NOTIFICATION = true;

	public static final boolean YEAR_MONTH_DIR = true;

	public static final boolean SAVE_USER_LOG = true;


}
