package topic;

import java.util.Scanner;

public class CRUDTest {

	public static void main(String[] args) {

		try (Scanner s = new Scanner(System.in)) {

			System.out.println("�z�n,�w��ϥή�饫����\�U�t��\n�H�U�t�Υ\����");
			System.out.println("��饫����\�U�t��:\n1.�d�� 2.�s�W 3.�ק� 4.�R�� 5.Ū���ɮ� 6.�����{��");
			while (s.hasNext()) {
				int input = s.nextInt();
				if (input <= 1) {
					System.out.println("1.��¬d�� 2.�d�߫��X�ɮ�");
					int inputq = s.nextInt();
					if (inputq <= 1) {
						System.out.println("�п�J�n�d�ߤ��ϰ�(�H��Ƥ��a�}���d�ߨ̾�)\nEX:'���c��',�Y�n�d�ߥ�����ƽп�J'��饫'");
						String choose = s.next();
						System.err.println("��ܤ���Ʈ榡��:�\�U�W��,�q��,�a�}");
						System.out.println("�H�U�� " + choose + " ���d�ߵ��G:");
						System.out.println();
						Query q = new Query();
						q.resQuery("%" + choose + "%");
						System.out.println();
						System.err.println("����:��ƭY���ťիh���L��Ʃο�J���~�Э��s�d��");
						System.out.println();
						System.out.println("��饫����\�U�t��:\n1.�d��,2.�s�W,3.�ק�,4.�R��,5.Ū���ɮ�,6.�����{��");

					} else if (inputq <= 2) {
						System.out.println("�п�J�n�d�ߤ��ϰ�(�H��Ƥ��a�}���d�ߨ̾�)\nEX:'���c��',�Y�n�d�ߥ�����ƽп�J'��饫'");
						String write = s.next();
						System.err.println("��ܤ���Ʈ榡��:�\�U�W��,�q��,�a�}");
						System.out.println("�H�U�� " + write + " ���d�ߵ��G:");
						System.out.println();
						Query q = new Query();
						q.resQuery("%" + write + "%");
						System.out.println();
						System.err.println("����:��ƭY���ťիh���L��Ʃο�J���~�Э��s�d��");
						System.out.println();
						System.out.println("�п�J�n��X��������|���ɦW\nEX: C:\\Users\\iSpan\\Desktop\\crud\\greenew");
						String path = s.next();
						WriteFile w = new WriteFile();
						w.write("%" + write + "%", path);
						System.out.println();
						System.err.println("�Y���w����Ƨ��L�ɮ׫h�i�ର���|�榡��J���~\n�Э��s�d�ߨè̽d�ҿ�J");
						System.out.println("��饫����\�U�t��:\n1.�d��,2.�s�W,3.�ק�,4.�R��,5.Ū���ɮ�,6.�����{��");

					} else {
						System.err.println("��J���~�Э��s��J");
						System.out.println("��饫����\�U�t��:\n1.�d��,2.�s�W,3.�ק�,4.�R��,5.Ū���ɮ�,6.�����{��");
					}

				} else if (input <= 2) {
					System.out.println("�Ш̴��ܿ�J�n�s�W���\�U");
					// System.out.println("�s��");
					// int no = s.nextInt();
					System.err.println("�\�U�W�r");
					String name = s.next();
					System.err.println("�\�U�q��");
					String phone = s.next();
					System.err.println("�\�U�a�}");
					String address = s.next();
					System.out.println("�s�W���\�U��: " + name + " �q��: " + phone + " �a�}: " + address);
					Insert i = new Insert();
					i.resInsert(name, phone, address);
					System.out.println();
					System.out.println("��饫����\�U�t��:\n1.�d��,2.�s�W,3.�ק�,4.�R��,5.Ū���ɮ�,6.�����{��");

				} else if (input <= 3) {
					System.out.println("�Ш̱ԭz��J�n�ק蠟�\�U��T\n1.��s�q�� 2.��s�a�} 3.��s�W��");
					int inputup = s.nextInt();
					if (inputup<=1) {
						System.err.println("�\�U�W��");
						String name = s.next();
						System.out.println("����:�Ъ�����J�s�q��");
						System.err.println("�s�q��");
						String phone = s.next();
						Update u = new Update();
						u.resUpdate(phone, name);
						System.out.println("��饫����\�U�t��:\n1.�d��,2.�s�W,3.�ק�,4.�R��,5.Ū���ɮ�,6.�����{��");
					}else if (inputup<=2) {
						System.err.println("�\�U�W��");
						String name = s.next();
						System.out.println("����:�Ъ�����J�s�a�}");
						System.err.println("�s�a�}");
						String address = s.next();
						UpdateAddress upad = new UpdateAddress();
						upad.resadUpdate(address, name);
						System.out.println("��饫����\�U�t��:\n1.�d��,2.�s�W,3.�ק�,4.�R��,5.Ū���ɮ�,6.�����{��");
					}else if (inputup<=3) {
						System.err.println("�ק��\�U�W�ٽЧR����A���s�W �Э��s��J");
						System.out.println("��饫����\�U�t��:\n1.�d��,2.�s�W,3.�ק�,4.�R��,5.Ū���ɮ�,6.�����{��");
					}else{
						System.err.println("��J���~�Э��s��J");
						System.out.println("��饫����\�U�t��:\n1.�d��,2.�s�W,3.�ק�,4.�R��,5.Ū���ɮ�,6.�����{��");
					}
					//System.out.println("�Ш̱ԭz��J�n�ק蠟�\�U��T\n����:�Y�n�ק��\�U�W�ٽЧR����A���s�W");

				} else if (input <= 4) {
					System.out.println("�п�J�n�R�����\�U�W��");
					System.err.println("�\�U�W��");
					String name = s.next();
					System.out.println("�O�_�T�w�n�R�� " + name);
					System.err.print("1.�T�w�R�� ");
					System.out.println("2.�����R��");
					int deinput = s.nextInt();
					if (deinput <= 1) {
						Delete d = new Delete();
						d.resDelete(name);
						System.out.println();
						System.out.println("��饫����\�U�t��:\n1.�d��,2.�s�W,3.�ק�,4.�R��,5.Ū���ɮ�,6.�����{��");

					} else if (deinput <= 2) {

						System.out.println("��饫����\�U�t��:\n1.�d��,2.�s�W,3.�ק�,4.�R��,5.Ū���ɮ�,6.�����{��");
					} else {
						System.err.println("��J���~�Э��s��J");
						System.out.println("��饫����\�U�t��:\n1.�d��,2.�s�W,3.�ק�,4.�R��,5.Ū���ɮ�,6.�����{��");
					}

				} else if (input <= 5) {
					System.out.println("�п�J�nŪ����CSV�ɮ׸��| EX: C:\\Users\\iSpan\\Desktop\\crud\\greenew.csv");
					String path = s.next();
					System.out.println();
					ReadCSV r = new ReadCSV();
					r.read(path);
					System.out.println();
					System.out.println("��饫����\�U�t��:\n1.�d��,2.�s�W,3.�ק�,4.�R��,5.Ū���ɮ�,6.�����{��");
				} else if(input <= 6){
					System.out.println("�����{��,�P�¨ϥΦ��t��");
					break;
				}else {
					System.err.println("��J���~�Э��s��J");
					System.out.println("1.�d��,2.�s�W,3.�ק�,4.�R��,5.Ū���ɮ�,6.�����{��");
				}
			}
		}
	}
}
