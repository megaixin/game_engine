import java.sql.*;
import java.util.ArrayList;

public class SqlExecutor{
	
	
	public static ArrayList<ArrayList<ArrayList<String>>> executeQuery( String inQuery) {
	
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection myCon = DriverManager.getConnection("jdbc:sqlserver://localhost","TestUserCreateByTransact", "TestUserCreateByTransact");
			Statement myStat = myCon.createStatement();
	
			myStat.execute(inQuery);
	
	
			ArrayList<ArrayList<ArrayList<String>>> myAnswer = new ArrayList<ArrayList<ArrayList<String>>>();
			ResultSet myRes = null;
			boolean isNowCount = false;
			boolean isNowResult = false;
	
	
			//разбираем результат выполнения запроса
			while ( true ){
	
				//определяем тип
				isNowCount = ( myStat.getUpdateCount() != -1 );
				isNowResult = ( myStat.getResultSet() != null );
	
				//если нет ни результата, ни количества - ливаем
				if (( isNowCount == false)&&( isNowResult == false)){
					break;
				}
	
				//если количество апдейтов, добавляем его в ответ
				if ( isNowCount == true ){
	
					int myCount = myStat.getUpdateCount();
					ArrayList<ArrayList<String>> myThisAll = new ArrayList<ArrayList<String>>();
	
	
					ArrayList<String> myFirstRow = new ArrayList<String>();
					myFirstRow.add( "resultCount");
					ArrayList<String> mySecondRow = new ArrayList<String>();
					mySecondRow.add( "int");
					ArrayList<String> myThirdRow = new ArrayList<String>();
					myThirdRow.add( Integer.toString(myCount) );
	
					myThisAll.add(myFirstRow);
					myThisAll.add(mySecondRow);
					myThisAll.add(myThirdRow);
					
					myAnswer.add(myThisAll);
					myStat.getMoreResults();
					
				}
				
				//	если результат, добавляем его в ответ
				if ( isNowResult == true ){
					myRes = myStat.getResultSet();
					ResultSetMetaData myMeta = myRes.getMetaData();
					int resultLength = myMeta.getColumnCount();
					
					ArrayList<ArrayList<String>> myThisAll = new ArrayList<ArrayList<String>>();
					
					//	в первую строку пишем названия столбцов. Нумерация с единицы
					ArrayList<String> myFirstRow = new ArrayList<String>();
					for (int i = 1; i <= resultLength; i++){
						String nowLabel = myMeta.getColumnLabel(i);
						if ( nowLabel.isEmpty() ){
							nowLabel = "withoutLabel";
						}
						myFirstRow.add( nowLabel );
					}
					myThisAll.add(myFirstRow);
	
					//во вторую строку пишем типы столбцов
					ArrayList<String> mySecondRow = new ArrayList<String>();
					for (int i = 1; i <= resultLength; i++){
						mySecondRow.add( myMeta.getColumnTypeName(i) );
					}
					myThisAll.add(mySecondRow);
	
					//и разбираем все остальные ебучие строки
					ArrayList<String> myNowRow ;
					while ( myRes.next() ) {
						
						myNowRow = new ArrayList<String>();
						for (int i = 1; i <= resultLength; i++){
							myNowRow.add( myRes.getString(i) );
						}
						myThisAll.add(myNowRow);
					}
					
					
	
					myAnswer.add(myThisAll);
					myStat.getMoreResults();
				}
	
	
			}
	
			return myAnswer;
	
	
	/*ResultSet myRes = myStat.executeQuery(myQuery);
	while (myRes.next()) {
	System.out.println("Номер в выборке #" + myRes.getRow()
	+ "\t Номер в базе #" + myRes.getInt("creature_id")
	+ "\t Название #" + myRes.getString("creature_name") );
	}*/
	
	
	
	
		} catch (ClassNotFoundException | SQLException ex1) {
	
	
			ArrayList<ArrayList<String>> myThisAll = new ArrayList<ArrayList<String>>();
	
			ArrayList<ArrayList<ArrayList<String>>> myAnswer = new ArrayList<ArrayList<ArrayList<String>>>();
			ArrayList<String> myFirstRow = new ArrayList<String>();
			myFirstRow.add( "executeError");
			ArrayList<String> mySecondRow = new ArrayList<String>();
			mySecondRow.add( ex1.getClass().getSimpleName() );
			ArrayList<String> myThirdRow = new ArrayList<String>();
			myThirdRow.add( ex1.getLocalizedMessage() );
	
			myThisAll.add(myFirstRow);
			myThisAll.add(mySecondRow);
			myThisAll.add(myThirdRow);
	
			myAnswer.add(myThisAll);
	
			System.out.println ("ошибка" + ex1.toString());
			return myAnswer;
	
		}
	}
	
	
	public static void showResult( ArrayList<?> inResult) {
	
		ArrayList<?> nowResultSet = null;
		ArrayList<?> nowResultSetRow = null;
		String nowString = null;
		StringBuilder outString = new StringBuilder();
	
	
		//для каждого ресалтСета
		for (int i = 0; i < inResult.size(); i++){
	
			nowResultSet = 	(ArrayList<?>) inResult.get(i);
			outString.append("{\n") ;
			//для каждой строки ресалтСета
			for (int k = 0; k < nowResultSet.size(); k++){
				
				outString.append("\t[ ") ;
				nowResultSetRow = (ArrayList<?>) nowResultSet.get(k);
				//	для каждого элемента в строке РесалтСета
				for (int m = 0; m < nowResultSetRow.size(); m++){
	
					nowString = (String) nowResultSetRow.get(m);
					outString.append( nowString ) ;
					outString.append( " , " ) ;
				}
				outString.setLength(outString.length() - 2 ); //чтоб обрезать конечные запятые после последнего элемента в строке
				outString.append(" ],\n" ) ;
	
	
			}
			outString.setLength(outString.length() - 2 ); //чтоб обрезать запятую после последней строки в резалт сете
			outString.append("\n},\n") ;
	
		}
	
	
		System.out.println ( outString.toString() ) ;
	
	}
	





}