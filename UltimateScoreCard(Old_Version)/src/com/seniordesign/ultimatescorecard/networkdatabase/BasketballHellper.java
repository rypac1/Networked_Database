package com.seniordesign.ultimatescorecard.networkdatabase;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;



import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONArray;

import android.util.Log;


public class BasketballHellper {
	//Static Variables
	// Logcat tag
	private static final String LOG = "BasketballDatabaseHelper";

	// Database Version
	private static final int DATABASE_VERSION = 1;

	// Database Name
	private static final String DATABASE_NAME = "BasketballStats";

	//Table Names
	private static final String TABLE_BASKETBALL_GAME_STATS = "basketball_game_stats";

	//GAMES Table - column names
	private static final String KEY_HOME_ID = "home_id";
	private static final String KEY_AWAY_ID = "away_id";
	private static final String KEY_DATE = "date";
	private static final String KEY_HOME_PTS = "home_pts";
	private static final String KEY_HOME_FGM = "home_fgm";
	private static final String KEY_HOME_FGA = "home_fga";
	private static final String KEY_HOME_FGM3 = "home_fgm3";
	private static final String KEY_HOME_FGA3 = "home_fga3";
	private static final String KEY_HOME_FTM = "home_ftm";
	private static final String KEY_HOME_FTA = "home_fta";
	private static final String KEY_HOME_OREB = "home_oreb";
	private static final String KEY_HOME_DREB = "home_dreb";
	private static final String KEY_HOME_AST = "home_ast";
	private static final String KEY_HOME_STL = "home_stl";
	private static final String KEY_HOME_BLK = "home_blk";
	private static final String KEY_HOME_TO = "home_turnover";
	private static final String KEY_HOME_PF = "home_pf";
	private static final String KEY_HOME_TECH = "home_tech";
	private static final String KEY_HOME_FLAGRANT = "home_flagrant";
	private static final String KEY_AWAY_PTS = "away_pts";
	private static final String KEY_AWAY_FGM = "away_fgm";
	private static final String KEY_AWAY_FGA = "away_fga";
	private static final String KEY_AWAY_FGM3 = "away_fgm3";
	private static final String KEY_AWAY_FGA3 = "away_fga3";
	private static final String KEY_AWAY_FTM = "away_ftm";
	private static final String KEY_AWAY_FTA = "away_fta";
	private static final String KEY_AWAY_OREB = "away_oreb";
	private static final String KEY_AWAY_DREB = "away_dreb";
	private static final String KEY_AWAY_AST = "away_ast";
	private static final String KEY_AWAY_STL = "away_stl";
	private static final String KEY_AWAY_BLK = "away_blk";
	private static final String KEY_AWAY_TO = "away_turnover";
	private static final String KEY_AWAY_PF = "away_pf";
	private static final String KEY_AWAY_TECH = "away_tech";
	private static final String KEY_AWAY_FLAGRANT = "away_flagrant";


	//BASKETBALLGAMESTATS Table - column names
	private static final String KEY_PTS = "pts";
	private static final String KEY_FGM = "fgm";
	private static final String KEY_FGA = "fga";
	private static final String KEY_FGM3 = "fgm3";
	private static final String KEY_FGA3 = "fga3";
	private static final String KEY_FTM = "ftm";
	private static final String KEY_FTA = "fta";
	private static final String KEY_OREB = "oreb";
	private static final String KEY_DREB = "dreb";
	private static final String KEY_AST = "ast";
	private static final String KEY_STL = "stl";
	private static final String KEY_BLK = "blk";
	private static final String KEY_TO = "turnover";
	private static final String KEY_PF = "pf";
	private static final String KEY_TECH = "tech";
	private static final String KEY_FLAGRANT = "flagrant";

	//private variables
	private String _user;
	private String _password;
	private String _schema;


	public BasketballHellper(String user, String password, String schema){
		_user = user;
		_password = password;
		_schema = schema;
	}


/*

	public void createGame() {
		// Check for success tag
		int success;
		try {
			// Building Parameters
			List<NameValuePair> params = new ArrayList<NameValuePair>();
			params.add(new BasicNameValuePair("pid", pid));

			// getting product details by making HTTP request
			// Note that product details url will use GET request
			JSONObject json = JSONParser.makeHttpRequest(
					url_product_detials, "GET", params);

			// check your log for json response
			Log.d("Single Product Details", json.toString());

			// json success tag
			success = json.getInt(TAG_SUCCESS);
			if (success == 1) {

			}	

		}
	}

*/
}
