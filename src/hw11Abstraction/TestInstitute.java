package hw11Abstraction;

public class TestInstitute {

	public static void main(String[] args) {
		System.out.println("\n------------------ColumbiaUniversity----------------------\n");
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
		columbiaUniversity.biology();
		columbiaUniversity.anatomy();
		columbiaUniversity.hygiene();
		columbiaUniversity.lawInfo();
		columbiaUniversity.commonRoom();
		columbiaUniversity.laboratory();
		columbiaUniversity.languageClub();
		columbiaUniversity.emergencyRoom();
		columbiaUniversity.surgeryRoom();
		columbiaUniversity.cafeteria();
		columbiaUniversity.vocationalInfo();
		columbiaUniversity.classSize();
		columbiaUniversity.playGround();
		columbiaUniversity.teacher();
		ColumbiaUniversity.columbia();// --- Static method
		columbiaUniversity.biochemistry();
		columbiaUniversity.gymnasium();
		columbiaUniversity.studyRoom();
		columbiaUniversity.pharmacy();
		columbiaUniversity.caring();
		columbiaUniversity.lawInfo();
		columbiaUniversity.vocationalInfo();
		columbiaUniversity.maths();
		System.out.println("\n------------------University----------------------\n");
		University university = new ColumbiaUniversity();
		university.classSize();
		university.playGround();
		university.teacher();
		university.gymnasium();
		University.library();// ---Static Method
		university.commonRoom();
		university.laboratory();
		university.languageClub();
		university.studyRoom();
		// University.dorm();//-- Static method of Interface college can't be call by
		// other interface University because they did not extends 
		university.emergencyRoom();
		university.surgeryRoom();
		university.cafeteria();
		university.pharmacy();
		// University.morgue();----Static method of Interface Hospital can't be call by
		// other interface University because they didn't extends 
		//Adding comment
		System.out.println("\n------------------Medical School----------------------\n");
		MedicalSchool medicalSchool = new ColumbiaUniversity();
		medicalSchool.anatomy();
		medicalSchool.biochemistry();
		MedicalSchool.medicalSchool();// -----Static Method
		medicalSchool.hygiene();
		medicalSchool.caring();
		medicalSchool.maths();
		medicalSchool.mechanicalLab();
		medicalSchool.aeronauticalInfo();
		medicalSchool.lawInfo();

	}

}
