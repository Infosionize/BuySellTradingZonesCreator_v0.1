package GUI_Prototype;

import java.util.ArrayList;

public class Helper {

	void printOutArrList(ArrayList<Object> inputList) {
		for (int i = 0; i < inputList.size(); i++) {
			String logOutput_Helper2 = "#" + i + " = " + inputList.get(i);
			// OutputLogList.addToOutputLogListEntries(logOutput_Helper2);
			System.out.println(logOutput_Helper2);
		}

	}

	void printOutArrList_String(ArrayList<String> inputList) {
		for (int i = 0; i < inputList.size(); i++) {
			String logOutput_Helper3 = "#" + i + " = " + inputList.get(i);
			// OutputLogList.addToOutputLogListEntries(logOutput_Helper3);
			System.out.println(logOutput_Helper3);

		}

	}

	void printOutArr(String[] txtarr) {
		System.out.println("printOutArr(String[] txtarr START");

		for (int i = 0; i < txtarr.length; i++) {
			String logOutput_Helper1 = "[" + i + "]" + txtarr[i];
			// OutputLogList.addToOutputLogListEntries(logOutput_Helper1);
			System.out.println(logOutput_Helper1);

		}
		System.out.println("printOutArr(String[] txtarr END");
	}

	public void printOutArrList(double[] arrayInput) {
		for (int i = 0; i < arrayInput.length; i++) {
			String logOutput_Helper2 = "#" + i + " = " + arrayInput[i];
			// OutputLogList.addToOutputLogListEntries(logOutput_Helper2);
			System.out.println(logOutput_Helper2);
		}

	}

}
