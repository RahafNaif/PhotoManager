package PA1;

//public class Test {
//	public static void main(String[] args) {
//		
//		LinkedList<String> tag1 = new LinkedList<String>();
//		tag1.insert("animal");
//		tag1.insert("headgehog");
//		tag1.insert("apple");
//		tag1.insert("grass");
//
//		LinkedList<String> tag2 = new LinkedList<String>();
//		tag2.insert("animal");
//		tag2.insert("bear");
//		tag2.insert("cub");
//		tag2.insert("grass");
//		
//		LinkedList<String> tag3 = new LinkedList<String>();
//		tag3.insert("insect");
//		tag3.insert("butterfly");
//		tag3.insert("flower");
//		tag3.insert("color");
//		
//
//		Photo p1 = new Photo("hedgehog.jpg", tag1);
//		Photo p2 = new Photo("bear.jpg", tag1);
//		Photo p3 = new Photo("rahaf.jpg", tag2);
//		Photo p4 = new Photo("rahfaf.jpg", tag2);
//		Photo p5 = new Photo("rahahf.jpg", tag2);
//		
//		
//		
//		PhotoManager pm = new PhotoManager();
//		
//		pm.addPhoto(p1);
//		pm.addPhoto(p2);
//		pm.addPhoto(p3);
//		pm.addPhoto(p4);
//		pm.addPhoto(p3);
//		
//		Album a = new Album("bears", "bear AND animal", pm);
//		
//		a.getPhotos().print();
//		System.out.print(a.getNbComps());
//		
//	}
//}


//public class Test {
//	public static void main(String[] args) {
//
//		LinkedList<String> tag1 = new LinkedList<String>();
//		tag1.insert("animal");
//		tag1.insert("headgehog");
//		tag1.insert("apple");
//		tag1.insert("grass");
//
//		LinkedList<String> tag2 = new LinkedList<String>();
//		tag2.insert("animal");
//		tag2.insert("bear");
//		tag2.insert("cub");
//		tag2.insert("grass");
//
//		LinkedList<String> tag3 = new LinkedList<String>();
//		tag3.insert("insect");
//		tag3.insert("butterfly");
//		tag3.insert("flower");
//		tag3.insert("color");
//
//		LinkedList<String> tag4 = new LinkedList<String>();
//		tag4.insert("insect");
//		tag4.insert("butterfly");
//		tag4.insert("flower");
//		tag4.insert("black");
//
//		LinkedList<String> tag5 = new LinkedList<String>();
//		tag5.insert("animal");
//		tag5.insert("fox");
//		tag5.insert("tree");
//		tag5.insert("grass");
//
//		LinkedList<String> tag6 = new LinkedList<String>();
//		tag6.insert("animal");
//		tag6.insert("bear");
//		tag6.insert("panda");
//		tag6.insert("grass");
//
//		LinkedList<String> tag7 = new LinkedList<String>();
//		tag7.insert("animal");
//		tag7.insert("wolf");
//		tag7.insert("sky");
//		tag7.insert("snow");
//
//		LinkedList<String> tag8 = new LinkedList<String>();
//		tag8.insert("animal");
//		tag8.insert("raccoon");
//		tag8.insert("log");
//		tag8.insert("snow");
//
//		Photo p1 = new Photo("hedgehog.jpg", tag1);
//		Photo p2 = new Photo("bear.jpg", tag2);
//		Photo p3 = new Photo("butterfly1.jpg", tag3);
//		Photo p4 = new Photo("butterfly2.jpg", tag4);
//		Photo p5 = new Photo("fox.jpg", tag5);
//		Photo p6 = new Photo("panda.jpg", tag6);
//		Photo p7 = new Photo("wolf.jpg", tag7);
//		Photo p8 = new Photo("raccoon.jpg", tag8);
//
//		PhotoManager pm = new PhotoManager();
//
//		pm.addPhoto(p1);
//		pm.addPhoto(p2);
//		pm.addPhoto(p3);
//		pm.addPhoto(p4);
//		pm.addPhoto(p5);
//		pm.addPhoto(p6);
//		pm.addPhoto(p7);
//		pm.addPhoto(p8);
//
//		//pm.deletePhoto("butterfly2.jpg");
//		
////		LinkedList<Photo> l = pm.manager;
////		display(l);
////	
////		LinkedList<String> k = pm.getAllTags();
////		displayTag(k);
////		
//		
//		BST<LinkedList<Photo>> in = pm.getPhotos();
//		in.inorder();
//		
//		
//	}
//
//	public static void display(LinkedList<Photo> l) {
//		if (l.empty())
//			System.out.println("empty");
//		else {
//			l.findFirst();
//			while (!l.last()) {
//				System.out.print(l.retrieve().getPath() + "-> ");
//				l.findNext();
//
//			}
//			System.out.print(l.retrieve().getPath());
//		}
//		System.out.println();
//		System.out.println();
//	}
//	
//	public static void displayTag(LinkedList<String> l) {
//		if (l.empty())
//			System.out.println("empty");
//		else {
//			l.findFirst();
//			while (!l.last()) {
//				System.out.print(l.retrieve() + "-> ");
//				l.findNext();
//
//			}
//			System.out.print(l.retrieve());
//		}
//		System.out.println();
//		System.out.println();
//	}
//}



//public class Test {
//
//	public static void main(String[] args) {
//
//		LinkedList<String> tag1 = new LinkedList<String>();
//		tag1.insert("animal");
//		tag1.insert("headgehog");
//		tag1.insert("apple");
//		tag1.insert("grass");
//
//		LinkedList<String> tag2 = new LinkedList<String>();
//		tag2.insert("animal");
//		tag2.insert("bear");
//		tag2.insert("cub");
//		tag2.insert("grass");
//
//		LinkedList<String> tag3 = new LinkedList<String>();
//		tag3.insert("insect");
//		tag3.insert("butterfly");
//		tag3.insert("flower");
//		tag3.insert("color");
//
//		LinkedList<String> tag4 = new LinkedList<String>();
//		tag4.insert("insect");
//		tag4.insert("butterfly");
//		tag4.insert("flower");
//		tag4.insert("black");
//
//		LinkedList<String> tag5 = new LinkedList<String>();
//		tag5.insert("animal");
//		tag5.insert("fox");
//		tag5.insert("tree");
//		tag5.insert("grass");
//
//		LinkedList<String> tag6 = new LinkedList<String>();
//		tag6.insert("animal");
//		tag6.insert("bear");
//		tag6.insert("panda");
//		tag6.insert("grass");
//
//		LinkedList<String> tag7 = new LinkedList<String>();
//		tag7.insert("animal");
//		tag7.insert("wolf");
//		tag7.insert("sky");
//		tag7.insert("snow");
//
//		LinkedList<String> tag8 = new LinkedList<String>();
//		tag8.insert("animal");
//		tag8.insert("raccoon");
//		tag8.insert("log");
//		tag8.insert("snow");
//
//		Photo p1 = new Photo("hedgehog.jpg", tag1);
//		Photo p2 = new Photo("bear.jpg", tag2);
//		Photo p3 = new Photo("butterfly1.jpg", tag3);
//		Photo p4 = new Photo("butterfly2.jpg", tag4);
//		Photo p5 = new Photo("fox.jpg", tag5);
//		Photo p6 = new Photo("panda.jpg", tag6);
//		Photo p7 = new Photo("wolf.jpg", tag7);
//		Photo p8 = new Photo("raccoon.jpg", tag8);
//
//		PhotoManager pm = new PhotoManager();
//
//		pm.addPhoto(p1);
//		pm.addPhoto(p2);
//		pm.addPhoto(p3);
//		pm.addPhoto(p4);
//		pm.addPhoto(p5);
//		pm.addPhoto(p6);
//		pm.addPhoto(p7);
//		pm.addPhoto(p8);
//
//		Album a = new Album("bears", "bear", pm);
//
//		LinkedList<Photo> PhotosOfA = a.getPhotos();
//
//		if (!PhotosOfA.empty()) {
//
//			PhotosOfA.findFirst();
//
//			while (!PhotosOfA.last()) {
//
//				System.out.println(PhotosOfA.retrieve().getPath());
//				PhotosOfA.findNext();
//
//			}
//
//			System.out.println(PhotosOfA.retrieve().getPath());
//
//		} else {
//
//			System.out.println("No Photos");
//		}
//		System.out.println("----------------------------------------");
//
//		pm.deletePhoto("panda.jpg");
//		
//		
//		PhotosOfA = a.getPhotos();
//
//		if (!PhotosOfA.empty()) {
//
//			PhotosOfA.findFirst();
//
//			while (!PhotosOfA.last()) {
//
//				System.out.println(PhotosOfA.retrieve().getPath());
//				PhotosOfA.findNext();
//
//			}
//
//			System.out.println(PhotosOfA.retrieve().getPath());
//
//		} else {
//
//			System.out.println("No Photos");
//		}
//		
//		
//	}
//
//}
//
//
//OUTPUT:
//bear.jpg
//panda.jpg
//----------------------------------------
//bear.jpg
//
//
//---------------------------------------------------------------------------------------------------------------------------------------
//
//
//
//public class Test {
//
//	public static void main(String[] args) {
//
//		LinkedList<String> tag1 = new LinkedList<String>();
//		tag1.insert("animal");
//		tag1.insert("headgehog");
//		tag1.insert("apple");
//		tag1.insert("grass");
//
//		LinkedList<String> tag2 = new LinkedList<String>();
//		tag2.insert("animal");
//		tag2.insert("bear");
//		tag2.insert("cub");
//		tag2.insert("grass");
//
//		LinkedList<String> tag3 = new LinkedList<String>();
//		tag3.insert("insect");
//		tag3.insert("butterfly");
//		tag3.insert("flower");
//		tag3.insert("color");
//
//		LinkedList<String> tag4 = new LinkedList<String>();
//		tag4.insert("insect");
//		tag4.insert("butterfly");
//		tag4.insert("flower");
//		tag4.insert("black");
//
//		LinkedList<String> tag5 = new LinkedList<String>();
//		tag5.insert("animal");
//		tag5.insert("fox");
//		tag5.insert("tree");
//		tag5.insert("grass");
//
//		LinkedList<String> tag6 = new LinkedList<String>();
//		tag6.insert("animal");
//		tag6.insert("bear");
//		tag6.insert("panda");
//		tag6.insert("grass");
//
//		LinkedList<String> tag7 = new LinkedList<String>();
//		tag7.insert("animal");
//		tag7.insert("wolf");
//		tag7.insert("sky");
//		tag7.insert("snow");
//
//		LinkedList<String> tag8 = new LinkedList<String>();
//		tag8.insert("animal");
//		tag8.insert("raccoon");
//		tag8.insert("log");
//		tag8.insert("snow");
//
//		Photo p1 = new Photo("hedgehog.jpg", tag1);
//		Photo p2 = new Photo("bear.jpg", tag2);
//		Photo p3 = new Photo("butterfly1.jpg", tag3);
//		Photo p4 = new Photo("butterfly2.jpg", tag4);
//		Photo p5 = new Photo("fox.jpg", tag5);
//		Photo p6 = new Photo("panda.jpg", tag6);
//		Photo p7 = new Photo("wolf.jpg", tag7);
//		Photo p8 = new Photo("raccoon.jpg", tag8);
//
//		PhotoManager pm = new PhotoManager();
//
//		pm.addPhoto(p1);
//		pm.addPhoto(p2);
//		pm.addPhoto(p3);
//		pm.addPhoto(p4);
//		pm.addPhoto(p5);
//		pm.addPhoto(p6);
//		pm.addPhoto(p7);
//		pm.addPhoto(p8);
//
//		Album a = new Album("bears", "animal ANDgrass", pm);
//
//		LinkedList<Photo> PhotosOfA = a.getPhotos();
//
//		if (!PhotosOfA.empty()) {
//
//			PhotosOfA.findFirst();
//
//			while (!PhotosOfA.last()) {
//
//				System.out.println(PhotosOfA.retrieve().getPath());
//				PhotosOfA.findNext();
//
//			}
//
//			System.out.println(PhotosOfA.retrieve().getPath());
//
//		} else {
//
//			System.out.println("No Photos");
//		}
//		System.out.println("----------------------------------------");
//
//		pm.deletePhoto("panda.jpg");
//		pm.deletePhoto("bear.jpg");
//		
//		PhotosOfA = a.getPhotos();
//
//		if (!PhotosOfA.empty()) {
//
//			PhotosOfA.findFirst();
//
//			while (!PhotosOfA.last()) {
//
//				System.out.println(PhotosOfA.retrieve().getPath());
//				PhotosOfA.findNext();
//
//			}
//
//			System.out.println(PhotosOfA.retrieve().getPath());
//
//		} else {
//
//			System.out.println("No Photos");
//		}
//	}
//
//}
//
//OUTPUT:
//hedgehog.jpg
//bear.jpg
//fox.jpg
//panda.jpg
//----------------------------------------
//hedgehog.jpg
//fox.jpg
//
//---------------------------------------------------------------------------------------------------------------------------------------
//
//
//public class Test {
//
//	public static void main(String[] args) {
//
//		LinkedList<String> tag1 = new LinkedList<String>();
//		tag1.insert("animal");
//		tag1.insert("headgehog");
//		tag1.insert("apple");
//		tag1.insert("grass");
//
//		LinkedList<String> tag2 = new LinkedList<String>();
//		tag2.insert("animal");
//		tag2.insert("bear");
//		tag2.insert("cub");
//		tag2.insert("grass");
//
//		LinkedList<String> tag3 = new LinkedList<String>();
//		tag3.insert("insect");
//		tag3.insert("butterfly");
//		tag3.insert("flower");
//		tag3.insert("color");
//
//		LinkedList<String> tag4 = new LinkedList<String>();
//		tag4.insert("insect");
//		tag4.insert("butterfly");
//		tag4.insert("flower");
//		tag4.insert("black");
//
//		LinkedList<String> tag5 = new LinkedList<String>();
//		tag5.insert("animal");
//		tag5.insert("fox");
//		tag5.insert("tree");
//		tag5.insert("grass");
//
//		LinkedList<String> tag6 = new LinkedList<String>();
//		tag6.insert("animal");
//		tag6.insert("bear");
//		tag6.insert("panda");
//		tag6.insert("grass");
//
//		LinkedList<String> tag7 = new LinkedList<String>();
//		tag7.insert("animal");
//		tag7.insert("wolf");
//		tag7.insert("sky");
//		tag7.insert("snow");
//
//		LinkedList<String> tag8 = new LinkedList<String>();
//		tag8.insert("animal");
//		tag8.insert("raccoon");
//		tag8.insert("log");
//		tag8.insert("snow");
//
//		Photo p1 = new Photo("hedgehog.jpg", tag1);
//		Photo p2 = new Photo("bear.jpg", tag2);
//		Photo p3 = new Photo("butterfly1.jpg", tag3);
//		Photo p4 = new Photo("butterfly2.jpg", tag4);
//		Photo p5 = new Photo("fox.jpg", tag5);
//		Photo p6 = new Photo("panda.jpg", tag6);
//		Photo p7 = new Photo("wolf.jpg", tag7);
//		Photo p8 = new Photo("raccoon.jpg", tag8);
//
//		PhotoManager pm = new PhotoManager();
//
//		pm.addPhoto(p1);
//		pm.addPhoto(p2);
//		pm.addPhoto(p3);
//		pm.addPhoto(p4);
//		pm.addPhoto(p5);
//		pm.addPhoto(p6);
//		pm.addPhoto(p7);
//		pm.addPhoto(p8);
//
//		Album a = new Album("bears", "", pm);
//
//		LinkedList<Photo> PhotosOfA = a.getPhotos();
//
//		if (!PhotosOfA.empty()) {
//
//			PhotosOfA.findFirst();
//
//			while (!PhotosOfA.last()) {
//
//				System.out.println(PhotosOfA.retrieve().getPath());
//				PhotosOfA.findNext();
//
//			}
//
//			System.out.println(PhotosOfA.retrieve().getPath());
//
//		} else {
//
//			System.out.println("No Photos");
//		}
//		System.out.println("----------------------------------------");
//
//		pm.deletePhoto("lion.jpg");
//		
//		PhotosOfA = a.getPhotos();
//
//		if (!PhotosOfA.empty()) {
//
//			PhotosOfA.findFirst();
//
//			while (!PhotosOfA.last()) {
//
//				System.out.println(PhotosOfA.retrieve().getPath());
//				PhotosOfA.findNext();
//
//			}
//
//			System.out.println(PhotosOfA.retrieve().getPath());
//
//		} else {
//
//			System.out.println("No Photos");
//		}
//	}
//
//}
//
//OUTPUT:
//hedgehog.jpg
//bear.jpg
//butterfly1.jpg
//butterfly2.jpg
//fox.jpg
//panda.jpg
//wolf.jpg
//raccoon.jpg
//----------------------------------------
//hedgehog.jpg
//bear.jpg
//butterfly1.jpg
//butterfly2.jpg
//fox.jpg
//panda.jpg
//wolf.jpg
//raccoon.jpg
//
//---------------------------------------------------------------------------------------------------------------------------------------
//
//
//public class Test {
//
//	public static void main(String[] args) {
//
//		LinkedList<String> tag1 = new LinkedList<String>();
//		tag1.insert("animal");
//		tag1.insert("headgehog");
//		tag1.insert("apple");
//		tag1.insert("grass");
//
//		LinkedList<String> tag2 = new LinkedList<String>();
//		tag2.insert("animal");
//		tag2.insert("bear");
//		tag2.insert("cub");
//		tag2.insert("grass");
//
//		LinkedList<String> tag3 = new LinkedList<String>();
//		tag3.insert("insect");
//		tag3.insert("butterfly");
//		tag3.insert("flower");
//		tag3.insert("color");
//
//		LinkedList<String> tag4 = new LinkedList<String>();
//		tag4.insert("insect");
//		tag4.insert("butterfly");
//		tag4.insert("flower");
//		tag4.insert("black");
//
//		LinkedList<String> tag5 = new LinkedList<String>();
//		tag5.insert("animal");
//		tag5.insert("fox");
//		tag5.insert("tree");
//		tag5.insert("grass");
//
//		LinkedList<String> tag6 = new LinkedList<String>();
//		tag6.insert("animal");
//		tag6.insert("bear");
//		tag6.insert("panda");
//		tag6.insert("grass");
//
//		LinkedList<String> tag7 = new LinkedList<String>();
//		tag7.insert("animal");
//		tag7.insert("wolf");
//		tag7.insert("sky");
//		tag7.insert("snow");
//
//		LinkedList<String> tag8 = new LinkedList<String>();
//		tag8.insert("animal");
//		tag8.insert("raccoon");
//		tag8.insert("log");
//		tag8.insert("snow");
//
//		Photo p1 = new Photo("hedgehog.jpg", tag1);
//		Photo p2 = new Photo("bear.jpg", tag2);
//		Photo p3 = new Photo("butterfly1.jpg", tag3);
//		Photo p4 = new Photo("butterfly2.jpg", tag4);
//		Photo p5 = new Photo("fox.jpg", tag5);
//		Photo p6 = new Photo("panda.jpg", tag6);
//		Photo p7 = new Photo("wolf.jpg", tag7);
//		Photo p8 = new Photo("raccoon.jpg", tag8);
//
//		PhotoManager pm = new PhotoManager();
//
//		pm.addPhoto(p1);
//		pm.addPhoto(p2);
//		pm.addPhoto(p3);
//		pm.addPhoto(p4);
//		pm.addPhoto(p5);
//		pm.addPhoto(p6);
//		pm.addPhoto(p7);
//		pm.addPhoto(p8);
//
//		Album a = new Album("bears", "snakes", pm);
//
//		LinkedList<Photo> PhotosOfA = a.getPhotos();
//
//		if (!PhotosOfA.empty()) {
//
//			PhotosOfA.findFirst();
//
//			while (!PhotosOfA.last()) {
//
//				System.out.println(PhotosOfA.retrieve().getPath());
//				PhotosOfA.findNext();
//
//			}
//
//			System.out.println(PhotosOfA.retrieve().getPath());
//
//		} else {
//
//			System.out.println("No Photos");
//		}
//		System.out.println("----------------------------------------");
//
//		pm.deletePhoto("lion.jpg");
//		
//		PhotosOfA = a.getPhotos();
//
//		if (!PhotosOfA.empty()) {
//
//			PhotosOfA.findFirst();
//
//			while (!PhotosOfA.last()) {
//
//				System.out.println(PhotosOfA.retrieve().getPath());
//				PhotosOfA.findNext();
//
//			}
//
//			System.out.println(PhotosOfA.retrieve().getPath());
//
//		} else {
//
//			System.out.println("No Photos");
//		}
//	}
//
//}

//OUTPUT:
//
//No Photos
//----------------------------------------
//No Photos
//
//----------------------------------------------------------------------------------------------------------------------
//
//
//public class Test {
//
//	public static void main(String[] args) {
//
//		LinkedList<String> tag1 = new LinkedList<String>();
//		tag1.insert("animal");
//		tag1.insert("headgehog");
//		tag1.insert("apple");
//		tag1.insert("grass");
//
//		LinkedList<String> tag2 = new LinkedList<String>();
//		tag2.insert("animal");
//		tag2.insert("bear");
//		tag2.insert("cub");
//		tag2.insert("grass");
//
//		LinkedList<String> tag3 = new LinkedList<String>();
//		tag3.insert("insect");
//		tag3.insert("butterfly");
//		tag3.insert("flower");
//		tag3.insert("color");
//
//		LinkedList<String> tag4 = new LinkedList<String>();
//		tag4.insert("insect");
//		tag4.insert("butterfly");
//		tag4.insert("flower");
//		tag4.insert("black");
//
//		LinkedList<String> tag5 = new LinkedList<String>();
//		tag5.insert("animal");
//		tag5.insert("fox");
//		tag5.insert("tree");
//		tag5.insert("grass");
//
//		LinkedList<String> tag6 = new LinkedList<String>();
//		tag6.insert("animal");
//		tag6.insert("bear");
//		tag6.insert("panda");
//		tag6.insert("grass");
//
//		LinkedList<String> tag7 = new LinkedList<String>();
//		tag7.insert("animal");
//		tag7.insert("wolf");
//		tag7.insert("sky");
//		tag7.insert("snow");
//
//		LinkedList<String> tag8 = new LinkedList<String>();
//		tag8.insert("animal");
//		tag8.insert("raccoon");
//		tag8.insert("log");
//		tag8.insert("snow");
//
//		Photo p1 = new Photo("hedgehog.jpg", tag1);
//		Photo p2 = new Photo("bear.jpg", tag2);
//		Photo p3 = new Photo("butterfly1.jpg", tag3);
//		Photo p4 = new Photo("butterfly2.jpg", tag4);
//		Photo p5 = new Photo("fox.jpg", tag5);
//		Photo p6 = new Photo("panda.jpg", tag6);
//		Photo p7 = new Photo("wolf.jpg", tag7);
//		Photo p8 = new Photo("raccoon.jpg", tag8);
//
//		PhotoManager pm = new PhotoManager();
//
//		pm.addPhoto(p1);
//		pm.addPhoto(p2);
//		pm.addPhoto(p3);
//		pm.addPhoto(p4);
//		pm.addPhoto(p5);
//		pm.addPhoto(p6);
//		pm.addPhoto(p7);
//		pm.addPhoto(p8);
//
//		Album a = new Album("bears", "bearANDgrassANDsnow", pm);
//
//		LinkedList<Photo> PhotosOfA = a.getPhotos();
//
//		if (!PhotosOfA.empty()) {
//
//			PhotosOfA.findFirst();
//
//			while (!PhotosOfA.last()) {
//
//				System.out.println(PhotosOfA.retrieve().getPath());
//				PhotosOfA.findNext();
//
//			}
//
//			System.out.println(PhotosOfA.retrieve().getPath());
//
//		} else {
//
//			System.out.println("No Photos");
//		}
//		System.out.println("----------------------------------------");
//
//		pm.deletePhoto("lion.jpg");
//		
//		PhotosOfA = a.getPhotos();
//
//		if (!PhotosOfA.empty()) {
//
//			PhotosOfA.findFirst();
//
//			while (!PhotosOfA.last()) {
//
//				System.out.println(PhotosOfA.retrieve().getPath());
//				PhotosOfA.findNext();
//
//			}
//
//			System.out.println(PhotosOfA.retrieve().getPath());
//
//		} else {
//
//			System.out.println("No Photos");
//		}
//	}
//
//}
//
//OUTPUT:
//
//No Photos
//----------------------------------------
//No Photos
//
//
//public class Test {
//
//	public static void main(String[] args) {
//
//		LinkedList<String> tag1 = new LinkedList<String>();
//		tag1.insert("animal");
//		tag1.insert("apple");
//		tag1.insert("grass");
//		tag1.insert("headgehog");
//
//		LinkedList<String> tag2 = new LinkedList<String>();
//		tag2.insert("bear");
//		tag2.insert("cub");
//		tag2.insert("animal");
//		tag2.insert("grass");
//
//		LinkedList<String> tag3 = new LinkedList<String>();
//		tag3.insert("butterfly");
//		tag3.insert("flower");
//		tag3.insert("insect");
//		tag3.insert("color");
//
//		LinkedList<String> tag4 = new LinkedList<String>();
//		tag4.insert("insect");
//		tag4.insert("butterfly");
//		tag4.insert("flower");
//		tag4.insert("black");
//
//		LinkedList<String> tag5 = new LinkedList<String>();
//		tag5.insert("animal");
//		tag5.insert("fox");
//		tag5.insert("tree");
//		tag5.insert("grass");
//
//		LinkedList<String> tag6 = new LinkedList<String>();
//		tag6.insert("animal");
//		tag6.insert("bear");
//		tag6.insert("panda");
//		tag6.insert("grass");
//
//		LinkedList<String> tag7 = new LinkedList<String>();
//		tag7.insert("animal");
//		tag7.insert("wolf");
//		tag7.insert("sky");
//		tag7.insert("snow");
//
//		LinkedList<String> tag8 = new LinkedList<String>();
//		tag8.insert("animal");
//		tag8.insert("raccoon");
//		tag8.insert("log");
//		tag8.insert("snow");
//
//		Photo p1 = new Photo("hedgehog.jpg", tag1);
//		Photo p2 = new Photo("bear.jpg", tag2);
//		Photo p3 = new Photo("butterfly1.jpg", tag3);
//		Photo p4 = new Photo("butterfly2.jpg", tag4);
//		Photo p5 = new Photo("fox.jpg", tag5);
//		Photo p6 = new Photo("panda.jpg", tag6);
//		Photo p7 = new Photo("wolf.jpg", tag7);
//		Photo p8 = new Photo("raccoon.jpg", tag8);
//
//		PhotoManager pm = new PhotoManager();
//
//		pm.addPhoto(p1);
//		pm.addPhoto(p2);
//		pm.addPhoto(p3);
//		pm.addPhoto(p4);
//		pm.addPhoto(p5);
//		pm.addPhoto(p6);
//		pm.addPhoto(p7);
//		pm.addPhoto(p8);
//
//		Album a = new Album("bears", "insect", pm);
//
//		System.out.println(a.getNbComps());
//	}
//}

//OUTPUT: 5
//
//----------------------------------------------------------------------------------------------------------------------------------------
//
//public class Test {
//
//	public static void main(String[] args) {
//
//		LinkedList<String> tag1 = new LinkedList<String>();
//		tag1.insert("animal");
//		tag1.insert("apple");
//		tag1.insert("grass");
//		tag1.insert("headgehog");
//
//		LinkedList<String> tag2 = new LinkedList<String>();
//		tag2.insert("bear");
//		tag2.insert("cub");
//		tag2.insert("animal");
//		tag2.insert("grass");
//
//		LinkedList<String> tag3 = new LinkedList<String>();
//		tag3.insert("butterfly");
//		tag3.insert("flower");
//		tag3.insert("insect");
//		tag3.insert("color");
//
//		LinkedList<String> tag4 = new LinkedList<String>();
//		tag4.insert("insect");
//		tag4.insert("butterfly");
//		tag4.insert("flower");
//		tag4.insert("black");
//
//		LinkedList<String> tag5 = new LinkedList<String>();
//		tag5.insert("animal");
//		tag5.insert("fox");
//		tag5.insert("tree");
//		tag5.insert("grass");
//
//		LinkedList<String> tag6 = new LinkedList<String>();
//		tag6.insert("animal");
//		tag6.insert("bear");
//		tag6.insert("panda");
//		tag6.insert("grass");
//
//		LinkedList<String> tag7 = new LinkedList<String>();
//		tag7.insert("animal");
//		tag7.insert("wolf");
//		tag7.insert("sky");
//		tag7.insert("snow");
//
//		LinkedList<String> tag8 = new LinkedList<String>();
//		tag8.insert("animal");
//		tag8.insert("raccoon");
//		tag8.insert("log");
//		tag8.insert("snow");
//
//		Photo p1 = new Photo("hedgehog.jpg", tag1);
//		Photo p2 = new Photo("bear.jpg", tag2);
//		Photo p3 = new Photo("butterfly1.jpg", tag3);
//		Photo p4 = new Photo("butterfly2.jpg", tag4);
//		Photo p5 = new Photo("fox.jpg", tag5);
//		Photo p6 = new Photo("panda.jpg", tag6);
//		Photo p7 = new Photo("wolf.jpg", tag7);
//		Photo p8 = new Photo("raccoon.jpg", tag8);
//
//		PhotoManager pm = new PhotoManager();
//
//		pm.addPhoto(p1);
//		pm.addPhoto(p2);
//		pm.addPhoto(p3);
//		pm.addPhoto(p4);
//		pm.addPhoto(p5);
//		pm.addPhoto(p6);
//		pm.addPhoto(p7);
//		pm.addPhoto(p8);
//
//		Album a = new Album("bears", "insect AND black", pm);
//
//		System.out.println(a.getNbComps());
//	}
//}
//
//OUTPUT:12
//
//----------------------------------------------------------------------------------------------------------------------------------------
//
//public class Test {
//
//	public static void main(String[] args) {
//
//		LinkedList<String> tag1 = new LinkedList<String>();
//		tag1.insert("animal");
//		tag1.insert("apple");
//		tag1.insert("grass");
//		tag1.insert("headgehog");
//
//		LinkedList<String> tag2 = new LinkedList<String>();
//		tag2.insert("bear");
//		tag2.insert("cub");
//		tag2.insert("animal");
//		tag2.insert("grass");
//
//		LinkedList<String> tag3 = new LinkedList<String>();
//		tag3.insert("butterfly");
//		tag3.insert("flower");
//		tag3.insert("insect");
//		tag3.insert("color");
//
//		LinkedList<String> tag4 = new LinkedList<String>();
//		tag4.insert("insect");
//		tag4.insert("butterfly");
//		tag4.insert("flower");
//		tag4.insert("black");
//
//		LinkedList<String> tag5 = new LinkedList<String>();
//		tag5.insert("animal");
//		tag5.insert("fox");
//		tag5.insert("tree");
//		tag5.insert("grass");
//
//		LinkedList<String> tag6 = new LinkedList<String>();
//		tag6.insert("animal");
//		tag6.insert("bear");
//		tag6.insert("panda");
//		tag6.insert("grass");
//
//		LinkedList<String> tag7 = new LinkedList<String>();
//		tag7.insert("animal");
//		tag7.insert("wolf");
//		tag7.insert("sky");
//		tag7.insert("snow");
//
//		LinkedList<String> tag8 = new LinkedList<String>();
//		tag8.insert("animal");
//		tag8.insert("raccoon");
//		tag8.insert("log");
//		tag8.insert("snow");
//
//		Photo p1 = new Photo("hedgehog.jpg", tag1);
//		Photo p2 = new Photo("bear.jpg", tag2);
//		Photo p3 = new Photo("butterfly1.jpg", tag3);
//		Photo p4 = new Photo("butterfly2.jpg", tag4);
//		Photo p5 = new Photo("fox.jpg", tag5);
//		Photo p6 = new Photo("panda.jpg", tag6);
//		Photo p7 = new Photo("wolf.jpg", tag7);
//		Photo p8 = new Photo("raccoon.jpg", tag8);
//
//		PhotoManager pm = new PhotoManager();
//
//		pm.addPhoto(p1);
//		pm.addPhoto(p2);
//		pm.addPhoto(p3);
//		pm.addPhoto(p4);
//		pm.addPhoto(p5);
//		pm.addPhoto(p6);
//		pm.addPhoto(p7);
//		pm.addPhoto(p8);
//
//		Album a = new Album("bears", "bear AND grass", pm);
//
//		System.out.println(a.getNbComps());
//	}
//}
//
//OUTPUT: 7
//---------------------------------------------------------------------------------------------------------
//
//
//public class Test {
//
//	public static void main(String[] args) {
//
//		LinkedList<String> tag1 = new LinkedList<String>();
//		tag1.insert("grass");
//		tag1.insert("animal");
//		tag1.insert("apple");
//		tag1.insert("headgehog");
//
//		LinkedList<String> tag2 = new LinkedList<String>();
//		tag2.insert("cub");
//		tag2.insert("animal");
//		tag2.insert("bear");
//		tag2.insert("grass");
//
//		LinkedList<String> tag3 = new LinkedList<String>();
//		tag3.insert("butterfly");
//		tag3.insert("flower");
//		tag3.insert("insect");
//		tag3.insert("color");
//
//		LinkedList<String> tag4 = new LinkedList<String>();
//		tag4.insert("insect");
//		tag4.insert("butterfly");
//		tag4.insert("flower");
//		tag4.insert("black");
//
//		LinkedList<String> tag5 = new LinkedList<String>();
//		tag5.insert("animal");
//		tag5.insert("fox");
//		tag5.insert("tree");
//		tag5.insert("grass");
//
//		LinkedList<String> tag6 = new LinkedList<String>();
//		tag6.insert("animal");
//		tag6.insert("bear");
//		tag6.insert("panda");
//		tag6.insert("grass");
//
//		LinkedList<String> tag7 = new LinkedList<String>();
//		tag7.insert("animal");
//		tag7.insert("wolf");
//		tag7.insert("sky");
//		tag7.insert("snow");
//
//		LinkedList<String> tag8 = new LinkedList<String>();
//		tag8.insert("animal");
//		tag8.insert("raccoon");
//		tag8.insert("log");
//		tag8.insert("snow");
//
//		Photo p1 = new Photo("hedgehog.jpg", tag1);
//		Photo p2 = new Photo("bear.jpg", tag2);
//		Photo p3 = new Photo("butterfly1.jpg", tag3);
//		Photo p4 = new Photo("butterfly2.jpg", tag4);
//		Photo p5 = new Photo("fox.jpg", tag5);
//		Photo p6 = new Photo("panda.jpg", tag6);
//		Photo p7 = new Photo("wolf.jpg", tag7);
//		Photo p8 = new Photo("raccoon.jpg", tag8);
//
//		PhotoManager pm = new PhotoManager();
//
//		pm.addPhoto(p1);
//		pm.addPhoto(p2);
//		pm.addPhoto(p3);
//		pm.addPhoto(p4);
//		pm.addPhoto(p5);
//		pm.addPhoto(p6);
//		pm.addPhoto(p7);
//		pm.addPhoto(p8);
//
//		Album a = new Album("bears", "bear AND grass", pm);
//
//		System.out.println(a.getNbComps());
//	}
//}
//
//OUTPUT: 6
//
//----------------------------------------------------------------------------------------
//
//
//public class Test {
//
//	public static void main(String[] args) {
//
//		LinkedList<String> tag1 = new LinkedList<String>();
//		tag1.insert("grass");
//		tag1.insert("apple");
//		tag1.insert("animal");
//		tag1.insert("headgehog");
//
//		LinkedList<String> tag2 = new LinkedList<String>();
//		tag2.insert("bear");
//		tag2.insert("cub");
//		tag2.insert("animal");
//		tag2.insert("grass");
//
//		LinkedList<String> tag3 = new LinkedList<String>();
//		tag3.insert("butterfly");
//		tag3.insert("flower");
//		tag3.insert("insect");
//		tag3.insert("color");
//
//		LinkedList<String> tag4 = new LinkedList<String>();
//		tag4.insert("insect");
//		tag4.insert("butterfly");
//		tag4.insert("flower");
//		tag4.insert("black");
//
//		LinkedList<String> tag5 = new LinkedList<String>();
//		tag5.insert("animal");
//		tag5.insert("fox");
//		tag5.insert("tree");
//		tag5.insert("grass");
//
//		LinkedList<String> tag6 = new LinkedList<String>();
//		tag6.insert("animal");
//		tag6.insert("bear");
//		tag6.insert("panda");
//		tag6.insert("grass");
//
//		LinkedList<String> tag7 = new LinkedList<String>();
//		tag7.insert("animal");
//		tag7.insert("wolf");
//		tag7.insert("sky");
//		tag7.insert("snow");
//
//		LinkedList<String> tag8 = new LinkedList<String>();
//		tag8.insert("animal");
//		tag8.insert("raccoon");
//		tag8.insert("log");
//		tag8.insert("snow");
//
//		Photo p1 = new Photo("hedgehog.jpg", tag1);
//		Photo p2 = new Photo("bear.jpg", tag2);
//		Photo p3 = new Photo("butterfly1.jpg", tag3);
//		Photo p4 = new Photo("butterfly2.jpg", tag4);
//		Photo p5 = new Photo("fox.jpg", tag5);
//		Photo p6 = new Photo("panda.jpg", tag6);
//		Photo p7 = new Photo("wolf.jpg", tag7);
//		Photo p8 = new Photo("raccoon.jpg", tag8);
//
//		PhotoManager pm = new PhotoManager();
//
//		pm.addPhoto(p1);
//		pm.addPhoto(p2);
//		pm.addPhoto(p3);
//		pm.addPhoto(p4);
//		pm.addPhoto(p5);
//		pm.addPhoto(p6);
//		pm.addPhoto(p7);
//		pm.addPhoto(p8);
//
//		Album a = new Album("bears", "bear AND grass AND animal", pm);
//
//		System.out.println(a.getNbComps());
//	}
//}
//
//OUTPUT: 7

//public class Test {
//
//	public static void main(String[] args) {
//
//		LinkedList<String> tag1 = new LinkedList<String>();
//		tag1.insert("animal");
//		tag1.insert("headgehog");
//		tag1.insert("apple");
//		tag1.insert("grass");
//		tag1.insert("green");
//
//		LinkedList<String> tag2 = new LinkedList<String>();
//		tag2.insert("animal");
//		tag2.insert("bear");
//		tag2.insert("cub");
//		tag2.insert("grass");
//		tag2.insert("wind");
//
//		LinkedList<String> tag3 = new LinkedList<String>();
//		tag3.insert("insect");
//		tag3.insert("butterfly");
//		tag3.insert("flower");
//		tag3.insert("color");
//
//		LinkedList<String> tag4 = new LinkedList<String>();
//		tag4.insert("insect");
//		tag4.insert("butterfly");
//		tag4.insert("black");
//		tag4.insert("flower");
//
//		LinkedList<String> tag5 = new LinkedList<String>();
//		tag5.insert("animal");
//		tag5.insert("fox");
//		tag5.insert("tree");
//		tag5.insert("forest");
//		tag5.insert("grass");
//
//		LinkedList<String> tag6 = new LinkedList<String>();
//		tag6.insert("animal");
//		tag6.insert("bear");
//		tag6.insert("panda");
//		tag6.insert("grass");
//
//		LinkedList<String> tag7 = new LinkedList<String>();
//		tag7.insert("animal");
//		tag7.insert("wolf");
//		tag7.insert("mountain");
//		tag7.insert("sky");
//		tag7.insert("snow");
//		tag7.insert("cloud");
//
//		LinkedList<String> tag8 = new LinkedList<String>();
//		tag8.insert("animal");
//		tag8.insert("raccoon");
//		tag8.insert("log");
//		tag8.insert("snow");
//
//		LinkedList<String> tag9 = new LinkedList<String>(); //null list 
//		
//		Photo p1 = new Photo("hedgehog.jpg", tag1);
//		Photo p2 = new Photo("bear.jpg", tag2);
//		Photo p3 = new Photo("butterfly1.jpg", tag3);
//		Photo p4 = new Photo("butterfly2.jpg", tag4);
//		Photo p5 = new Photo("fox.jpg", tag5);
//		Photo p6 = new Photo("panda.jpg", tag6);
//		Photo p7 = new Photo("wolf.jpg", tag7);
//		Photo p8 = new Photo("raccoon.jpg", tag8);
//		Photo p9 = new Photo("butterfly1.jpg", tag1); //duplicate path name
//		Photo p10 = new Photo("image.jpg", tag9); //empty tag
//
//		PhotoManager pm = new PhotoManager();
//
//		pm.addPhoto(p1);
//		pm.addPhoto(p2);
//		pm.addPhoto(p3);
//		pm.addPhoto(p4);
//		pm.addPhoto(p5);
//		pm.addPhoto(p6);
//		pm.addPhoto(p7);
//		pm.addPhoto(p8);
//		pm.addPhoto(p9); //your code shouldn't add this
//		pm.addPhoto(p10); //your code shouldn't add this
//		
//		pm.deletePhoto("nonexistent.jpg"); //your tree remains the same
//		pm.deletePhoto("raccoon.jpg"); //this path is deleted and any empty tag is also deleted
//	
//		Album album1 = new Album("All Photos", "", pm); 
//		display(album1.getPhotos());//should display all photos, without raccoon.jpg
//		
//		pm.deletePhoto("butterfly1.jpg");
//		display(album1.getPhotos()); //shouldn't contain butterfly1
//		
//		Album album2 = new Album("Animals", "animal", pm);
//		display(album2.getPhotos()); 
//		
//		Album album3 = new Album("ButterFlies", "insect AND butterfly", pm);
//		display(album3.getPhotos()); 
//		
//		Album album4 = new Album("Random", "cub AND headgehog AND lizard AND wolf", pm); //lizard is skipped
//		display(album4.getPhotos());
//		
//		Album album5 = new Album("Nothing", "nothing AND empty", pm); 
//		display(album5.getPhotos()); //empty list
//		
//		System.out.println(album1.getNbComps()); //not sure if 0 or all the actual comparisons :)
//		System.out.println(album2.getNbComps()); //1 animal is the root node
//		System.out.println(album3.getNbComps()); //11
//		System.out.println(album4.getNbComps()); //19
//		System.out.println(album5.getNbComps()); //14
//	}
//
//	public static void display(LinkedList<Photo> l) {
//		if (l == null || l.empty())
//			System.out.println("Empty Photo List");
//		else {
//			l.findFirst();
//			while (!l.last()) {
//				System.out.print(l.retrieve().getPath() + "-> ");
//				l.findNext();
//
//			}
//			System.out.print(l.retrieve().getPath());
//		}
//		System.out.println("\n----------------------------");
//	}
//
//	public static void displayTag(LinkedList<String> l) {
//		if (l.empty())
//			System.out.println("Empty Tag List");
//		else {
//			l.findFirst();
//			while (!l.last()) {
//				System.out.print(l.retrieve() + "-> ");
//				l.findNext();
//
//			}
//			System.out.print(l.retrieve());
//		}
//		System.out.println("\n----------------------------");
//	}
//}

//hedgehog.jpg-> bear.jpg-> fox.jpg-> panda.jpg-> wolf.jpg-> image.jpg-> butterfly2.jpg-> butterfly1.jpg
//----------------------------
//hedgehog.jpg-> bear.jpg-> fox.jpg-> panda.jpg-> wolf.jpg-> image.jpg-> butterfly2.jpg
//----------------------------
//hedgehog.jpg-> bear.jpg-> fox.jpg-> panda.jpg-> wolf.jpg-> image.jpg
//----------------------------
//butterfly2.jpg
//----------------------------
//Empty Photo List
//
//----------------------------
//Empty Photo List
//
//----------------------------
//0
//1
//11
//19
//14


//public class Test {
//
//	public static void main(String[] args) {
//
//		LinkedList<String> tag1 = new LinkedList<String>();
//		tag1.insert("animal");
//		tag1.insert("headgehog");
//		tag1.insert("apple");
//		tag1.insert("grass");
//		tag1.insert("green");
//
//		LinkedList<String> tag2 = new LinkedList<String>();
//		tag2.insert("animal");
//		tag2.insert("bear");
//		tag2.insert("cub");
//		tag2.insert("grass");
//		tag2.insert("wind");
//
//		LinkedList<String> tag3 = new LinkedList<String>();
//		tag3.insert("insect");
//		tag3.insert("butterfly");
//		tag3.insert("flower");
//		tag3.insert("color");
//
//		LinkedList<String> tag4 = new LinkedList<String>();
//		tag4.insert("insect");
//		tag4.insert("butterfly");
//		tag4.insert("black");
//		tag4.insert("flower");
//
//		LinkedList<String> tag5 = new LinkedList<String>();
//		tag5.insert("animal");
//		tag5.insert("fox");
//		tag5.insert("tree");
//		tag5.insert("forest");
//		tag5.insert("grass");
//
//		LinkedList<String> tag6 = new LinkedList<String>();
//		tag6.insert("animal");
//		tag6.insert("bear");
//		tag6.insert("panda");
//		tag6.insert("grass");
//
//		LinkedList<String> tag7 = new LinkedList<String>();
//		tag7.insert("animal");
//		tag7.insert("wolf");
//		tag7.insert("mountain");
//		tag7.insert("sky");
//		tag7.insert("snow");
//		tag7.insert("cloud");
//
//		LinkedList<String> tag8 = new LinkedList<String>();
//		tag8.insert("animal");
//		tag8.insert("raccoon");
//		tag8.insert("log");
//		tag8.insert("snow");
//
//		Photo p1 = new Photo("hedgehog.jpg", tag1);
//		Photo p2 = new Photo("bear.jpg", tag2);
//		Photo p3 = new Photo("butterfly1.jpg", tag3);
//		Photo p4 = new Photo("butterfly2.jpg", tag4);
//		Photo p5 = new Photo("fox.jpg", tag5);
//		Photo p6 = new Photo("panda.jpg", tag6);
//		Photo p7 = new Photo("wolf.jpg", tag7);
//		Photo p8 = new Photo("raccoon.jpg", tag8);
//
//		PhotoManager pm = new PhotoManager();
//
//		pm.addPhoto(p1);
//		pm.addPhoto(p2);
//		pm.addPhoto(p3);
//		pm.addPhoto(p4);
//		pm.addPhoto(p5);
//		pm.addPhoto(new Photo("snake.jpg", null)); // your code shouldn't add this
//		pm.addPhoto(p6);
//		pm.addPhoto(p7);
//		pm.addPhoto(new Photo("snake.jpg", new LinkedList<String>())); 
//		pm.addPhoto(p8);
//		pm.addPhoto(new Photo("butterfly2.jpg", tag2)); // the path is duplicated, you shouldn't add this
//		pm.addPhoto(new Photo("raccoon.jpg", tag2)); // the same with this one
//
//		display(pm.getAllPhotos()); // display all photos
//		pm.deletePhoto("butterfly1.jpg");
//		display(pm.getAllPhotos()); // all photos w/o butterfly1
//		pm.deletePhoto("raccoon.jpg");
//		display(pm.getAllPhotos());
//		pm.deletePhoto("raccoon.jpg"); // the photo doesn't exist anymore, the list shouldn't change
//		display(pm.getAllPhotos());
//		pm.deletePhoto("ghtffu.jpg"); // the same with this one
//		display(pm.getAllPhotos());
//		pm.deletePhoto("bear.jpg");
//		pm.deletePhoto("butterfly2.jpg");
//		pm.deletePhoto("fox.jpg");
//		pm.deletePhoto("wolf.jpg");
//		pm.deletePhoto("panda.jpg");
//		display(pm.getAllPhotos()); //  hedgehog and snake
//		pm.deletePhoto("hedgehog.jpg");
//		display(pm.getAllPhotos()); // only snake
//	}
//
//	public static void display(LinkedList<Photo> l) {
//		if (l == null || l.empty()) {
//			System.out.println("Empty Photo List");
//			return;
//		}
//
//		l.findFirst();
//		while (!l.last()) {
//			System.out.print(l.retrieve().getPath() + " --> ");
//			l.findNext();
//		}
//		System.out.print(l.retrieve().getPath());
//		System.out.println("\n--------------------------------");
//	}
//}
//ADD AND DELETE
//hedgehog.jpg --> bear.jpg --> butterfly1.jpg --> butterfly2.jpg --> fox.jpg --> panda.jpg --> wolf.jpg --> snake.jpg --> raccoon.jpg
//--------------------------------
//hedgehog.jpg --> bear.jpg --> butterfly2.jpg --> fox.jpg --> panda.jpg --> wolf.jpg --> snake.jpg --> raccoon.jpg
//--------------------------------
//hedgehog.jpg --> bear.jpg --> butterfly2.jpg --> fox.jpg --> panda.jpg --> wolf.jpg --> snake.jpg
//--------------------------------
//hedgehog.jpg --> bear.jpg --> butterfly2.jpg --> fox.jpg --> panda.jpg --> wolf.jpg --> snake.jpg
//--------------------------------
//hedgehog.jpg --> bear.jpg --> butterfly2.jpg --> fox.jpg --> panda.jpg --> wolf.jpg --> snake.jpg
//--------------------------------
//hedgehog.jpg --> snake.jpg
//--------------------------------
//snake.jpg
//--------------------------------



//public class Test {
//
//   public static void main(String[] args) {
//   
//      /*
//      Tags Diagram (Tags before deletion of any photo):
//               Animal
//                 +
//                 |
//                 |
//                 |
//                 |
//                 +---------->Creature
//                               ++
//                               ||
//                               ||
//                               ||
//                               ||
//                Big  <-------------------->Fly
//                 +
//                 |
//                 |
//                 |
//                 |
//                 +---->Bug
//   
//      */
//      String[][] tags = {{"animal", "creature"}, {"big", "animal"}, {"bug", "fly", "animal"}};
//      String[] names = {"panda.jpg", "bigfoot.png", "butterfly.jpg"};
//      PhotoManager pm = new PhotoManager();
//   
//      for (int i = 0; i < 3; i++)
//         pm.addPhoto(new Photo(names[i], arrToLL(tags[i])));
//   
//      Album album;
//      LinkedList<Photo> albumPhotos;
//   
//      /*
//       * FOR THE FOLLOWING TESTS TO WORK YOU NEED TO FOLLOW THIS:
//       *   The list of photos that belong to the album is determined at the time when
//       *   the method getPhotos is called, not when the album is created.
//       * */
//      
//      System.out.println("___________Album 0___________\n\tTest: General condition\n");
//      album = new Album("doesn't matter", "fly", pm);
//      albumPhotos = album.getPhotos();
//      System.out.printf("Photos found using the condition \"%s\" are:\n", album.getCondition()); printLL(albumPhotos);
//      System.out.printf("Number of comparisons of condition \"%s\" is %d", album.getCondition(), album.getNbComps());
//   
//      System.out.println("\n\n\n___________Album 1___________\n\tTest: Tag deletion (empty tags in BST should be removed)\n");
//      album = new Album("doesn't matter", "fly", pm);
//      pm.deletePhoto("butterfly.jpg");
//      albumPhotos = album.getPhotos();
//      System.out.printf("Photos found using the condition \"%s\" are:\n", album.getCondition()); printLL(albumPhotos);
//      System.out.printf("Number of comparisons of condition \"%s\" is %d", album.getCondition(), album.getNbComps());
//   
//      System.out.println("\n\n\n___________Album 2___________\n\tTest: Double addition\n");
//      album = new Album("doesn't matter", "fly", pm);
//      pm.addPhoto(new Photo("butterfly.jpg", new LinkedList<>()));
//      LinkedList<String> fakeList = new LinkedList<>(); fakeList.insert("fly");
//      pm.addPhoto(new Photo("butterfly.jpg", fakeList));
//      albumPhotos = album.getPhotos();
//      System.out.printf("Photos found using the condition \"%s\" are:\n", album.getCondition()); printLL(albumPhotos);
//      System.out.printf("Number of comparisons of condition \"%s\" is %d", album.getCondition(), album.getNbComps());
//   
//      System.out.println("\n\n\n___________Album 3___________\n\tTest: Empty condition\n");
//      album = new Album("doesn't matter", "", pm);
//      albumPhotos = album.getPhotos();
//      System.out.printf("Photos found using the condition \"%s\" are:\n", album.getCondition()); printLL(albumPhotos);
//      System.out.printf("Number of comparisons of condition \"%s\" is %d", album.getCondition(), album.getNbComps());
//   
//   
//      System.out.println("\n\n\n___________Album 4___________\n\tTest: Foreign condition\n");
//      album = new Album("doesn't matter", "alien", pm);
//      albumPhotos = album.getPhotos();
//      System.out.printf("Photos found using the condition \"%s\" are:\n", album.getCondition()); printLL(albumPhotos);
//      System.out.printf("Number of comparisons of condition \"%s\" is %d", album.getCondition(), album.getNbComps());
//   
//      System.out.println("\n\n\n___________Album 5___________\n\tTest: Partially foreign condition\n");
//      album = new Album("doesn't matter", "animal AND alien", pm);
//      albumPhotos = album.getPhotos();
//      System.out.printf("Photos found using the condition \"%s\" are:\n", album.getCondition()); printLL(albumPhotos);
//      System.out.printf("Number of comparisons of condition \"%s\" is %d", album.getCondition(), album.getNbComps());
//   
//      System.out.println("\n\n\n___________Album 6___________\n\tTest: Addition of a photo with no tags\n");
//      album = new Album("doesn't matter", "", pm);
//      pm.addPhoto(new Photo("Tyrannosaurus_x.jpg", new LinkedList<>()));
//      albumPhotos = album.getPhotos();
//      System.out.printf("Photos found using the condition \"%s\" are:\n", album.getCondition()); printLL(albumPhotos);
//      System.out.printf("Number of comparisons of condition \"%s\" is %d", album.getCondition(), album.getNbComps());
//   }
//
//   private static <T> LinkedList<T> arrToLL(T[] arr){
//      LinkedList<T> list = new LinkedList<T>();
//      for (T el : arr)
//         list.insert(el);
//      return list;
//   }
//
//   private static void printLL(LinkedList<Photo> ll){
//   
//      ll.findFirst();
//      if(ll.empty()) 
//         return;
//   
//      
//      while(true){
//         System.out.println(ll.retrieve().getPath());
//         if(ll.last()) 
//            return;
//         ll.findNext();
//      }
//   }
//}


//### OUTPUT (THE OUTPUT ISNT 100% RELIABLE, USE IT AS A ROUGH GUIDELINE. YOU SHOULD CONSULT YOUR PROF. TO BE SURE)
//
//___________Album 0___________
//	Test: General condition
//
//Photos found using the condition "fly" are:
//butterfly.jpg
//Number of comparisons of condition "fly" is 3
//
//
//___________Album 1___________
//	Test: Tag deletion (empty tags in BST should be removed)
//
//Photos found using the condition "fly" are:
//Number of comparisons of condition "fly" is 2
//
//
//___________Album 2___________
//	Test: Double addition
//
//Photos found using the condition "fly" are:
//Number of comparisons of condition "fly" is 2
//
//
//___________Album 3___________
//	Test: Empty condition
//
//Photos found using the condition "" are:
//panda.jpg
//bigfoot.png
//butterfly.jpg
//Number of comparisons of condition "" is 0
//
//
//___________Album 4___________
//	Test: Foreign condition
//
//Photos found using the condition "alien" are:
//Number of comparisons of condition "alien" is 1
//
//
//___________Album 5___________
//	Test: Partially foreign condition
//
//Photos found using the condition "animal AND alien" are:
//Number of comparisons of condition "animal AND alien" is 2
//
//
//___________Album 6___________
//	Test: Addition of a photo with no tags
//
//Photos found using the condition "" are:
//panda.jpg
//bigfoot.png
//butterfly.jpg
//Tyrannosaurus_x.jpg
//Number of comparisons of condition "" is 0


//public class Test {
//
//	public static void main(String[] args) {
//
//		LinkedList<String> tag1 = new LinkedList<String>();
//		tag1.insert("animal");
//		tag1.insert("headgehog");
//		tag1.insert("apple");
//		tag1.insert("grass");
//		tag1.insert("green");
//
//		LinkedList<String> tag2 = new LinkedList<String>();
//		tag2.insert("animal");
//		tag2.insert("bear");
//		tag2.insert("cub");
//		tag2.insert("grass");
//		tag2.insert("wind");
//
//		LinkedList<String> tag3 = new LinkedList<String>();
//		tag3.insert("insect");
//		tag3.insert("butterfly");
//		tag3.insert("flower");
//		tag3.insert("color");
//
//		LinkedList<String> tag4 = new LinkedList<String>();
//		tag4.insert("insect");
//		tag4.insert("butterfly");
//		tag4.insert("black");
//		tag4.insert("flower");
//
//		LinkedList<String> tag5 = new LinkedList<String>();
//		tag5.insert("animal");
//		tag5.insert("fox");
//		tag5.insert("tree");
//		tag5.insert("forest");
//		tag5.insert("grass");
//
//		LinkedList<String> tag6 = new LinkedList<String>();
//		tag6.insert("animal");
//		tag6.insert("bear");
//		tag6.insert("panda");
//		tag6.insert("grass");
//
//		LinkedList<String> tag7 = new LinkedList<String>();
//		tag7.insert("animal");
//		tag7.insert("wolf");
//		tag7.insert("mountain");
//		tag7.insert("sky");
//		tag7.insert("snow");
//		tag7.insert("cloud");
//
//		LinkedList<String> tag8 = new LinkedList<String>();
//		tag8.insert("animal");
//		tag8.insert("raccoon");
//		tag8.insert("log");
//		tag8.insert("snow");
//
//		LinkedList<String> tag9 = new LinkedList<String>();
//		tag9.insert("animal");
//		tag9.insert("desert");
//		tag9.insert("scales");
//		tag9.insert("warm");
//
//		Photo p1 = new Photo("hedgehog.jpg", tag1);
//		Photo p2 = new Photo("bear.jpg", tag2);
//		Photo p3 = new Photo("butterfly1.jpg", tag3);
//		Photo p4 = new Photo("butterfly2.jpg", tag4);
//		Photo p5 = new Photo("fox.jpg", tag5);
//		Photo p6 = new Photo("panda.jpg", tag6);
//		Photo p7 = new Photo("wolf.jpg", tag7);
//		Photo p8 = new Photo("raccoon.jpg", tag8);
//		Photo p9 = new Photo("lizard.jpg", tag9);
//
//		PhotoManager pm = new PhotoManager();
//
//		pm.addPhoto(p1);
//		pm.addPhoto(p2);
//		pm.addPhoto(p3);
//		pm.addPhoto(p4);
//		pm.addPhoto(p5);
//		pm.addPhoto(p6);
//		pm.addPhoto(p7);
//		pm.addPhoto(p8);
//		pm.addPhoto(new Photo("image.jpg", new LinkedList<String>()));
//
//		Album album = new Album("ALL", "", pm);
//
//		display(album.getPhotos()); // displays all photos
//
//		pm.deletePhoto("butterfly1.jpg");
//		display(album.getPhotos()); // displays all photos w/o butterfly1.jpg
//		System.out.println(album.getNbComps());
//		System.out.println();
//
//		album = new Album("Bears", "bear", pm);
//		display(album.getPhotos());
//		System.out.println(album.getNbComps());
//		System.out.println();
//
//		album = new Album("empty", "gecko", pm);
//		display(album.getPhotos()); // should be empty
//		System.out.println(album.getNbComps());
//		System.out.println();
//
//		album = new Album("empty", "animal AND grass", pm);
//		display(album.getPhotos());
//		System.out.println(album.getNbComps());
//		System.out.println();
//
//		album = new Album("Bears", "animal AND grass AND bear", pm);
//		display(album.getPhotos());
//		System.out.println(album.getNbComps());
//		System.out.println();
//
//		album = new Album("Wolf", "wolf AND sky AND snow AND cloud", pm);
//		display(album.getPhotos());
//		System.out.println(album.getNbComps());
//
//		album = new Album("empty", "animal AND jhfj", pm);
//		display(album.getPhotos()); // empty
//		System.out.println(album.getNbComps());
//		System.out.println();
//
//		album = new Album("Butterfly", "insect AND black AND flower AND butterfly", pm);
//		display(album.getPhotos());
//		System.out.println(album.getNbComps());
//		System.out.println();
//
//		album = new Album("empty", "animal AND black AND flower", pm);
//		display(album.getPhotos()); // empty
//		System.out.println(album.getNbComps());
//		System.out.println();
//
//		pm.addPhoto(p9);
//		album = new Album("ALL", "", pm);
//		display(album.getPhotos()); // include lizard
//		System.out.println(album.getNbComps());
//		System.out.println();
//		
//		album = new Album("Lizard", "desert AND animal", pm);
//		display(album.getPhotos());
//		System.out.println(album.getNbComps());
//		System.out.println();
//
//		album = new Album("Lizard", "animal AND desert", pm);
//		display(album.getPhotos());
//		System.out.println(album.getNbComps());
//		System.out.println();
//
//		album = new Album("ALL", " ", pm);
//		display(album.getPhotos()); // empty
//		System.out.println(album.getNbComps());
//	}
//
//	public static void display(LinkedList<Photo> l) {
//		if (l == null || l.empty()) {
//			System.out.println("Empty Photo List");
//			return;
//		}
//
//		l.findFirst();
//		while (!l.last()) {
//			System.out.print(l.retrieve().getPath() + " --> ");
//			l.findNext();
//		}
//		System.out.print(l.retrieve().getPath());
//		System.out.println("\n--------------------------------");
//	}
//}
//OUTPUT
//hedgehog.jpg --> bear.jpg --> fox.jpg --> panda.jpg --> wolf.jpg --> raccoon.jpg --> image.jpg --> butterfly2.jpg --> butterfly1.jpg
//--------------------------------
//hedgehog.jpg --> bear.jpg --> fox.jpg --> panda.jpg --> wolf.jpg --> raccoon.jpg --> image.jpg --> butterfly2.jpg
//--------------------------------
//0
//
//bear.jpg --> panda.jpg
//--------------------------------
//5
//
//Empty Photo List
//8
//
//hedgehog.jpg --> bear.jpg --> fox.jpg --> panda.jpg
//--------------------------------
//5
//
//bear.jpg --> panda.jpg
//--------------------------------
//10
//
//wolf.jpg
//--------------------------------
//27
//Empty Photo List
//9
//
//butterfly2.jpg
//--------------------------------
//26
//
//Empty Photo List
//16
//
//lizard.jpg --> hedgehog.jpg --> bear.jpg --> panda.jpg --> butterfly2.jpg --> wolf.jpg --> fox.jpg --> raccoon.jpg
//--------------------------------
//0
//
//lizard.jpg
//--------------------------------
//9
//
//lizard.jpg
//--------------------------------
//9
//
//Empty Photo List
//1

//public class Test {
//
//	public static void main(String[] args) {
//
//		LinkedList<String> tag1 = new LinkedList<String>();
//		tag1.insert("animal");
//		tag1.insert("hedgehog");
//		tag1.insert("apple");
//		tag1.insert("grass");
//		tag1.insert("green");
//
//		LinkedList<String> tag2 = new LinkedList<String>();
//		tag2.insert("animal");
//		tag2.insert("bear");
//		tag2.insert("cub");
//		tag2.insert("grass");
//		tag2.insert("wind");
//
//		LinkedList<String> tag3 = new LinkedList<String>();
//		tag3.insert("insect");
//		tag3.insert("butterfly");
//		tag3.insert("flower");
//		tag3.insert("color");
//
//		LinkedList<String> tag4 = new LinkedList<String>();
//		tag4.insert("insect");
//		tag4.insert("butterfly");
//		tag4.insert("black");
//		tag4.insert("flower");
//
//		LinkedList<String> tag5 = new LinkedList<String>();
//		tag5.insert("animal");
//		tag5.insert("fox");
//		tag5.insert("tree");
//		tag5.insert("forest");
//		tag5.insert("grass");
//
//		LinkedList<String> tag6 = new LinkedList<String>();
//		tag6.insert("animal");
//		tag6.insert("bear");
//		tag6.insert("panda");
//		tag6.insert("grass");
//
//		LinkedList<String> tag7 = new LinkedList<String>();
//		tag7.insert("animal");
//		tag7.insert("wolf");
//		tag7.insert("mountain");
//		tag7.insert("sky");
//		tag7.insert("snow");
//		tag7.insert("cloud");
//
//		LinkedList<String> tag8 = new LinkedList<String>();
//		tag8.insert("animal");
//		tag8.insert("raccoon");
//		tag8.insert("log");
//		tag8.insert("snow");
//
//		LinkedList<String> tag9 = new LinkedList<String>();
//		tag9.insert("animal");
//		tag9.insert("desert");
//		tag9.insert("scales");
//		tag9.insert("warm");
//
//		Photo p1 = new Photo("hedgehog.jpg", tag1);
//		Photo p2 = new Photo("bear.jpg", tag2);
//		Photo p3 = new Photo("butterfly1.jpg", tag3);
//		Photo p4 = new Photo("butterfly2.jpg", tag4);
//		Photo p5 = new Photo("fox.jpg", tag5);
//		Photo p6 = new Photo("panda.jpg", tag6);
//		Photo p7 = new Photo("wolf.jpg", tag7);
//		Photo p8 = new Photo("raccoon.jpg", tag8);
//		Photo p9 = new Photo("lizard.jpg", tag9);
//
//		PhotoManager pm = new PhotoManager();
//
//		pm.addPhoto(p1);
//		pm.addPhoto(p2);
//		pm.addPhoto(p3);
//		pm.addPhoto(p4);
//		pm.addPhoto(p5);
//		pm.addPhoto(p6);
//		pm.addPhoto(p7);
//		pm.addPhoto(p8);
//		pm.addPhoto(new Photo("image.jpg", new LinkedList<String>())); // add it
//
//		Album album = new Album("ALL", "", pm);
//		System.out.println("All Photos in Album");
//		display(album.getPhotos()); // displays all photos
//		
//		System.out.println("_______________");
//
//		pm.deletePhoto("butterfly1.jpg");
//		System.out.println("All Photos in Album w/o butterfly1.jpg");
//		display(album.getPhotos()); // displays all photos w/o butterfly1.jpg
//		System.out.println(album.getNbComps());
//		System.out.println();
//		
//		System.out.println("_______________");
//
//		album = new Album("Bears", "bear", pm);
//		System.out.println("All Photos Containing bears Tag");
//		display(album.getPhotos());
//		System.out.println(album.getNbComps());
//		System.out.println();
//		
//		System.out.println("_______________");
//
//		album = new Album("empty", "gecko", pm);
//		System.out.println("All Photos Containing gecko Tag");
//		display(album.getPhotos()); // should be empty
//		System.out.println(album.getNbComps());
//		System.out.println();
//		
//		System.out.println("_______________");
//
//		album = new Album("empty", "animal AND grass", pm);
//		System.out.println("All Photos Containing animal and grass Tags");
//		display(album.getPhotos());
//		System.out.println(album.getNbComps());
//		System.out.println();
//		
//		System.out.println("_______________");
//
//		album = new Album("Bears", "animal AND grass AND bear", pm);
//		System.out.println("All Photos Containing animal and grass and bear Tags");
//		display(album.getPhotos());
//		System.out.println(album.getNbComps());
//		System.out.println();
//		
//		System.out.println("_______________");
//
//		album = new Album("Wolf", "wolf AND sky AND snow AND cloud", pm);
//		System.out.println("All Photos Containing wolf and sky and snow and cloud Tags");
//		display(album.getPhotos());
//		System.out.println(album.getNbComps());
//		
//		System.out.println("_______________");
//
//		album = new Album("empty", "animal AND omnivore", pm);
//		System.out.println("All Photos Containing animal and omnivore Tags");
//		display(album.getPhotos()); // empty
//		System.out.println(album.getNbComps());
//		System.out.println();
//		
//		System.out.println("_______________");
//
//		album = new Album("Butterfly", "insect AND black AND flower AND butterfly", pm);
//		System.out.println("All Photos Containing insect and black and flower and butterfly Tags");
//		display(album.getPhotos());
//		System.out.println(album.getNbComps());
//		System.out.println();
//		
//		System.out.println("_______________");
//
//		album = new Album("empty", "animal AND black AND flower", pm);
//		System.out.println("All Photos Containing animal and black and flower Tags");
//		display(album.getPhotos()); // empty
//		System.out.println(album.getNbComps());
//		System.out.println();
//		
//		System.out.println("_______________");
//
//		pm.addPhoto(p9);
//		album = new Album("ALL", "", pm);
//		System.out.println("All Photos in Album");
//		display(album.getPhotos()); // include lizard
//		System.out.println(album.getNbComps());
//		System.out.println();
//		
//		System.out.println("_______________");
//		
//		album = new Album("Lizard", "desert AND animal", pm);
//		System.out.println("All Photos Containing desert and animal Tags");
//		display(album.getPhotos());
//		System.out.println(album.getNbComps());
//		System.out.println();
//		
//		System.out.println("_______________");
//
//		album = new Album("Lizard", "animal AND desert", pm);
//		System.out.println("All Photos Containing desert and animal Tags");
//		display(album.getPhotos());
//		System.out.println(album.getNbComps());
//		System.out.println();
//		
//		System.out.println("_______________");
//
//		pm.deletePhoto("image.jpg");
//		album = new Album("ALL", "", pm);
//		System.out.println("All Photos in Album");
//		display(album.getPhotos()); // empty
//		System.out.println(album.getNbComps());
//	}
//
//	public static void display(LinkedList<Photo> l) {
//		if (l == null || l.empty()) {
//			System.out.println("Empty Photo List \n");
//			return;
//		}
//
//		l.findFirst();
//		while (!l.last()) {
//			System.out.print(l.retrieve().getPath() + " --> ");
//			l.findNext();
//		}
//		System.out.print(l.retrieve().getPath());
//		System.out.println("\n");
//	}
//}
//All Photos in Album
//hedgehog.jpg --> bear.jpg --> fox.jpg --> panda.jpg --> wolf.jpg --> raccoon.jpg --> image.jpg --> butterfly2.jpg --> butterfly1.jpg
//
//_______________
//All Photos in Album w/o butterfly1.jpg
//hedgehog.jpg --> bear.jpg --> fox.jpg --> panda.jpg --> wolf.jpg --> raccoon.jpg --> image.jpg --> butterfly2.jpg
//
//0
//
//_______________
//All Photos Containing bears Tag
//bear.jpg --> panda.jpg
//
//5
//
//_______________
//All Photos Containing gecko Tag
//Empty Photo List 
//
//8
//
//_______________
//All Photos Containing animal and grass Tags
//hedgehog.jpg --> bear.jpg --> fox.jpg --> panda.jpg
//
//5
//
//_______________
//All Photos Containing animal and grass and bear Tags
//bear.jpg --> panda.jpg
//
//10
//
//_______________
//All Photos Containing wolf and sky and snow and cloud Tags
//wolf.jpg
//
//27
//_______________
//All Photos Containing animal and omnivore Tags
//Empty Photo List 
//
//8
//
//_______________
//All Photos Containing insect and black and flower and butterfly Tags
//butterfly2.jpg
//
//26
//
//_______________
//All Photos Containing animal and black and flower Tags
//Empty Photo List 
//
//16
//
//_______________
//All Photos in Album
//lizard.jpg --> hedgehog.jpg --> bear.jpg --> panda.jpg --> butterfly2.jpg --> wolf.jpg --> fox.jpg --> raccoon.jpg
//
//0
//
//_______________
//All Photos Containing desert and animal Tags
//lizard.jpg
//
//9
//
//_______________
//All Photos Containing desert and animal Tags
//lizard.jpg
//
//9
//
//_______________
//All Photos in Album
//lizard.jpg --> hedgehog.jpg --> bear.jpg --> panda.jpg --> butterfly2.jpg --> wolf.jpg --> fox.jpg --> raccoon.jpg
//
//0
//
//public class Test {
//    public static void main(String[] args) {
//	
//	
//	//these are some simple test cases that cover the basic utility of the PA
//	PhotoManager pm = testAdd();
//	testDelete();
//	testGetPhotos(pm);
//    }
//
//    private static void testGetPhotos(PhotoManager pm) {
//	Album a = new Album("A", "", pm);
//	a.getPhotos().print();
//
//	Album b = new Album("B", "bear", pm);
//	System.out.println(b.getPhotos());
////	
//	Album ag = new Album("ab", "animal AND grass", pm);
//	System.out.println(ag.getPhotos());
//
//	ag = new Album("ab2", "grass AND animal", pm);
//	System.out.println(ag.getPhotos());
////	
//	Album e = new Album("R", "fsdfg", pm);
//	System.out.println(e.getPhotos());
//
//	e = new Album("R2", "grass AND fsdfg", pm);
//	System.out.println(e.getPhotos());
//
//	Album s = new Album("R", "snow AND bear", pm);
//	System.out.println(s.getPhotos());
////	
//    }
//
//    private static PhotoManager testAdd() {
//
//	PhotoManager pm = new PhotoManager();
//	pm.addPhoto(creatPhoto("hedgehog.jpg", "animal", "hedgehog", "apple", "grass", "green"));
//	pm.addPhoto(creatPhoto("bear.jpg", "animal", "bear", "cub", "grass", "wind"));
//	pm.addPhoto(creatPhoto("butterfly1.jpg", "insect", "butterfly", "flower", "color"));
//	pm.addPhoto(creatPhoto("butterfly2.jpg", "insect", "butterfly", "flower", "black"));
//	pm.addPhoto(creatPhoto("fox.jpg", "animal", "fox", "tree", "forest", "grass"));
//	pm.addPhoto(creatPhoto("panda.jpg", "animal", "bear", "panda", "grass"));
//	pm.addPhoto(creatPhoto("wolf.jpg", "animal", "wolf", "mountain", "sky", "snow", "cloud"));
//	pm.addPhoto(creatPhoto("raccoon.jpg", "animal", "raccoon", "log", "snow"));
//
//	Print(pm);
//	return pm;
//    }
//
//    private static Photo creatPhoto(String path, String... tags) {
//	LinkedList<String> ll = new LinkedList<String>();
//	for (String string : tags) {
//	    ll.insert(string);
//	}
//	return new Photo(path, ll);
//    }
//
//    private static void testDelete() {
//
//	PhotoManager pm = new PhotoManager();
//
//	LinkedList<String> ll = new LinkedList<String>();
//	ll.insert("Foxtrot");
//	ll.insert("Tango");
//	ll.insert("Charlie");
//	pm.addPhoto(new Photo("x", ll));
//
//	LinkedList<String> ll2 = new LinkedList<String>();
//	ll2.insert("Foxtrot");
//	ll2.insert("3");
//	pm.addPhoto(new Photo("y", ll2));
//
//	System.out.println("deleting x");
//	Print(pm);
//
//	pm.deletePhoto("x");
//
//	System.out.println("deleting non-existing");
//	Print(pm);
//
//	pm.deletePhoto("y");
//
//	System.out.println("deleting y");
//	Print(pm);
//    }
//
//    private static void Print(PhotoManager pm) {
//	System.out.println("========================");
//	pm.getPhotos().print();
//	System.out.println("========================");
//
//    }
//}
//
//public class Test {
//
//	public static void main(String[] args) {
//
//		LinkedList<String> tag1 = new LinkedList<String>();
//		tag1.insert("animal");
//		tag1.insert("hedgehog");
//		tag1.insert("apple");
//		tag1.insert("grass");
//		tag1.insert("green");
//
//		LinkedList<String> tag2 = new LinkedList<String>();
//		tag2.insert("animal");
//		tag2.insert("bear");
//		tag2.insert("cub");
//		tag2.insert("grass");
//		tag2.insert("wind");
//
//		LinkedList<String> tag3 = new LinkedList<String>();
//		tag3.insert("insect");
//		tag3.insert("butterfly");
//		tag3.insert("flower");
//		tag3.insert("color");
//
//		LinkedList<String> tag4 = new LinkedList<String>();
//		tag4.insert("insect");
//		tag4.insert("butterfly");
//		tag4.insert("black");
//		tag4.insert("flower");
//
//		LinkedList<String> tag5 = new LinkedList<String>();
//		tag5.insert("animal");
//		tag5.insert("fox");
//		tag5.insert("tree");
//		tag5.insert("forest");
//		tag5.insert("grass");
//
//		LinkedList<String> tag6 = new LinkedList<String>();
//		tag6.insert("animal");
//		tag6.insert("bear");
//		tag6.insert("panda");
//		tag6.insert("grass");
//
//		LinkedList<String> tag7 = new LinkedList<String>();
//		tag7.insert("animal");
//		tag7.insert("wolf");
//		tag7.insert("mountain");
//		tag7.insert("sky");
//		tag7.insert("snow");
//		tag7.insert("cloud");
//
//		LinkedList<String> tag8 = new LinkedList<String>();
//		tag8.insert("animal");
//		tag8.insert("raccoon");
//		tag8.insert("log");
//		tag8.insert("snow");
//
//		LinkedList<String> tag9 = new LinkedList<String>();
//		tag9.insert("animal");
//		tag9.insert("desert");
//		tag9.insert("scales");
//		tag9.insert("warm");
//
//		Photo p1 = new Photo("hedgehog.jpg", tag1);
//		Photo p2 = new Photo("bear.jpg", tag2);
//		Photo p3 = new Photo("butterfly1.jpg", tag3);
//		Photo p4 = new Photo("butterfly2.jpg", tag4);
//		Photo p5 = new Photo("fox.jpg", tag5);
//		Photo p6 = new Photo("panda.jpg", tag6);
//		Photo p7 = new Photo("wolf.jpg", tag7);
//		Photo p8 = new Photo("raccoon.jpg", tag8);
//		Photo p9 = new Photo("lizard.jpg", tag9);
//
//		PhotoManager pm = new PhotoManager();
//
//		pm.addPhoto(p1);
//		pm.addPhoto(p2);
//		pm.addPhoto(p3);
//		pm.addPhoto(p4);
//		pm.addPhoto(p5);
//		pm.addPhoto(p6);
//		pm.addPhoto(p7);
//		pm.addPhoto(p8);
//		pm.addPhoto(new Photo("image.jpg", new LinkedList<String>())); // add it
//
//		Album album = new Album("ALL", "", pm);
//		System.out.println("All Photos in Album");
//		display(album.getPhotos()); // displays all photos
//		
//		System.out.println("_________________________________________");
//
//		pm.deletePhoto("butterfly1.jpg");
//		System.out.println("All Photos in Album w/o butterfly1.jpg");
//		display(album.getPhotos()); // displays all photos w/o butterfly1.jpg
//		System.out.println(album.getNbComps());
//		System.out.println();
//		
//		System.out.println("_________________________________________");
//
//		album = new Album("Bears", "bear", pm);
//		System.out.println("All Photos Containing bear Tag");
//		display(album.getPhotos());
//		System.out.println(album.getNbComps());
//		System.out.println();
//		
//		System.out.println("_________________________________________");
//
//		album = new Album("empty", "gecko", pm);
//		System.out.println("All Photos Containing gecko Tag");
//		display(album.getPhotos()); // should be empty
//		System.out.println(album.getNbComps());
//		System.out.println();
//		
//		System.out.println("_________________________________________");
//
//		album = new Album("empty", "animal AND grass", pm);
//		System.out.println("All Photos Containing animal and grass Tags");
//		display(album.getPhotos());
//		System.out.println(album.getNbComps());
//		System.out.println();
//		
//		System.out.println("_________________________________________");
//
//		album = new Album("Bears", "animal AND grass AND bear", pm);
//		System.out.println("All Photos Containing animal and grass and bear Tags");
//		display(album.getPhotos());
//		System.out.println(album.getNbComps());
//		System.out.println();
//		
//		System.out.println("_________________________________________");
//
//		album = new Album("Wolf", "wolf AND sky AND snow AND cloud", pm);
//		System.out.println("All Photos Containing wolf and sky and snow and cloud Tags");
//		display(album.getPhotos());
//		System.out.println(album.getNbComps());
//		
//		System.out.println("_________________________________________");
//
//		album = new Album("empty", "animal AND omnivore", pm);
//		System.out.println("All Photos Containing animal and omnivore Tags");
//		display(album.getPhotos()); // empty
//		System.out.println(album.getNbComps());
//		System.out.println();
//		
//		System.out.println("_________________________________________");
//
//		album = new Album("Butterfly", "insect AND black AND flower AND butterfly", pm);
//		System.out.println("All Photos Containing insect and black and flower and butterfly Tags");
//		display(album.getPhotos());
//		System.out.println(album.getNbComps());
//		System.out.println();
//		
//		System.out.println("_________________________________________");
//
//		album = new Album("empty", "animal AND black AND flower", pm);
//		System.out.println("All Photos Containing animal and black and flower Tags");
//		display(album.getPhotos()); // empty
//		System.out.println(album.getNbComps());
//		System.out.println();
//		
//		System.out.println("_________________________________________");
//
//		pm.addPhoto(p9);
//		album = new Album("ALL", "", pm);
//		System.out.println("All Photos in Album");
//		display(album.getPhotos()); // include lizard
//		System.out.println(album.getNbComps());
//		System.out.println();
//		
//		System.out.println("_________________________________________");
//		
//		album = new Album("Lizard", "desert AND animal", pm);
//		System.out.println("All Photos Containing desert and animal Tags");
//		display(album.getPhotos());
//		System.out.println(album.getNbComps());
//		System.out.println();
//		
//		System.out.println("_________________________________________");
//
//		album = new Album("Lizard", "animal AND desert", pm);
//		System.out.println("All Photos Containing desert and animal Tags");
//		display(album.getPhotos());
//		System.out.println(album.getNbComps());
//		System.out.println();
//		
//		System.out.println("_________________________________________");
//
//		pm.deletePhoto("image.jpg");
//		album = new Album("ALL", "", pm);
//		System.out.println("All Photos in Album");
//		display(album.getPhotos()); // empty
//		System.out.println(album.getNbComps());
//	}
//
//	public static void display(LinkedList<Photo> l) {
//		if (l == null || l.empty()) {
//			System.out.println("Empty Photo List \n");
//			return;
//		}
//
//		l.findFirst();
//		while (!l.last()) {
//			System.out.print(l.retrieve().getPath() + " --> ");
//			l.findNext();
//		}
//		System.out.print(l.retrieve().getPath());
//		System.out.println("\n");
//	}
//}


//
//public class Test {
//
//	public static void main(String[] args) {
//
//		LinkedList<String> tag1 = new LinkedList<String>(); // empty tag
//		LinkedList<String> tag2 = new LinkedList<String>(); 
//		tag2.insert("hello");
//
//
//		Photo p1 = new Photo("hedgehog.jpg", tag1);
//		Photo p2 = new Photo("bear.jpg", tag1);
//		Photo p3 = new Photo("butterfly1.jpg", tag1);
//	
//
//		PhotoManager pm = new PhotoManager();
//
//		pm.addPhoto(p1);
//		pm.addPhoto(p2);
//		pm.addPhoto(p3);
//		pm.addPhoto(new Photo("something.jpg", null)); // shouldn't be added
//		pm.addPhoto(new Photo("bear.jpg", tag2)); // shouldn't be added
//		pm.addPhoto(new Photo("cockatoo.jpg", new LinkedList<String>())); // add it
//
//		Album album = new Album("ALL", "", pm);
//		System.out.println("All Photos in Album");
//		display(album.getPhotos()); // displays all photos
//		System.out.println("_________________________________________");
//
//		pm.deletePhoto("butterfly1.jpg");
//		pm.deletePhoto("hedgehog.jpg");
//		pm.deletePhoto("hedgehog.jpg");
//
//		album = new Album("empty", "gecko", pm);
//		System.out.println("All Photos Containing gecko Tag");
//		display(album.getPhotos()); // should be empty
//		System.out.println(album.getNbComps());
//		System.out.println();
//		
//		System.out.println("_________________________________________");
//
//		pm.addPhoto(p1);
//		album = new Album("Bears", "animal AND grass AND bear", pm);
//		System.out.println("All Photos Containing animal and grass and bear Tags");
//		display(album.getPhotos());
//		System.out.println(album.getNbComps());
//		System.out.println();
//		
//		System.out.println("_________________________________________");
//
//		album = new Album("Wolf", "wolf AND sky AND snow AND cloud", pm);
//		System.out.println("All Photos Containing wolf and sky and snow and cloud Tags");
//		display(album.getPhotos());
//		System.out.println(album.getNbComps());
//		
//		System.out.println("_________________________________________");
//
//		album = new Album("Lizard", "animal AND desert", pm);
//		System.out.println("All Photos Containing desert and animal Tags");
//		display(album.getPhotos());
//		System.out.println(album.getNbComps());
//		System.out.println();
//		
//		System.out.println("_________________________________________");
//
//		pm.deletePhoto("image.jpg");
//		pm.addPhoto(new Photo("image.jpg", new LinkedList<String>()));
//		pm.deletePhoto("image.jpg");
//		
//		album = new Album("ALL", "", pm);
//		System.out.println("All Photos in Album");
//		display(album.getPhotos()); 
//		System.out.println(album.getNbComps());
//	}
//
//	public static void display(LinkedList<Photo> l) {
//		if (l == null || l.empty()) {
//			System.out.println("Empty Photo List \n");
//			return;
//		}
//		l.findFirst();
//		while (!l.last()) {
//			System.out.print(l.retrieve().getPath() + " --> ");
//			l.findNext();
//		}
//		System.out.print(l.retrieve().getPath());
//		System.out.println("\n");
//	}
//}

public class Test {

	public static void main(String[] args) {

		LinkedList<String> tag1 = new LinkedList<String>();
		tag1.insert("hedgehog");
		tag1.insert("animal");
		tag1.insert("apple");
		tag1.insert("grass");
		tag1.insert("green");

		LinkedList<String> tag2 = new LinkedList<String>();
		tag2.insert("animal");
		tag2.insert("bear");
		tag2.insert("cub");
		tag2.insert("grass");
		tag2.insert("wind");

		LinkedList<String> tag3 = new LinkedList<String>();
		tag3.insert("insect");
		tag3.insert("butterfly");
		tag3.insert("flower");
		tag3.insert("color");

		LinkedList<String> tag4 = new LinkedList<String>();
		tag4.insert("insect");
		tag4.insert("butterfly");
		tag4.insert("black");
		tag4.insert("flower");

		LinkedList<String> tag5 = new LinkedList<String>();
		tag5.insert("animal");
		tag5.insert("fox");
		tag5.insert("tree");
		tag5.insert("forest");
		tag5.insert("grass");

		LinkedList<String> tag6 = new LinkedList<String>();
		tag6.insert("animal");
		tag6.insert("bear");
		tag6.insert("panda");
		tag6.insert("grass");

		LinkedList<String> tag7 = new LinkedList<String>();
		tag7.insert("animal");
		tag7.insert("wolf");
		tag7.insert("mountain");
		tag7.insert("sky");
		tag7.insert("snow");
		tag7.insert("cloud");

		LinkedList<String> tag8 = new LinkedList<String>();
		tag8.insert("animal");
		tag8.insert("raccoon");
		tag8.insert("log");
		tag8.insert("snow");

		LinkedList<String> tag9 = new LinkedList<String>();
		tag9.insert("animal");
		tag9.insert("desert");
		tag9.insert("scales");
		tag9.insert("warm");

		Photo p1 = new Photo("hedgehog.jpg", tag1);
		Photo p2 = new Photo("bear.jpg", tag2);
		Photo p3 = new Photo("butterfly1.jpg", tag3);
		Photo p4 = new Photo("butterfly2.jpg", tag4);
		Photo p5 = new Photo("fox.jpg", tag5);
		Photo p6 = new Photo("panda.jpg", tag6);
		Photo p7 = new Photo("wolf.jpg", tag7);
		Photo p8 = new Photo("raccoon.jpg", tag8);
		Photo p9 = new Photo("lizard.jpg", tag9);

		PhotoManager pm = new PhotoManager();

		pm.addPhoto(p1);
		pm.addPhoto(p2);
		pm.addPhoto(p3);
		pm.addPhoto(p4);
		pm.addPhoto(new Photo("something.jpg", null)); // shouldn't be added
		pm.addPhoto(p5);
		pm.addPhoto(new Photo("fox.jpg", tag5)); // shouldn't be added, duplicate name
		pm.addPhoto(p6);
		pm.addPhoto(p7);
		pm.addPhoto(p8);
		pm.addPhoto(new Photo("image.jpg", new LinkedList<String>())); // should be added

		Album album = new Album("ALL", "", pm);
		System.out.println("All Photos in Album");
		display(album.getPhotos()); // displays all photos
		System.out.println("_________________________________________");

		pm.deletePhoto("butterfly1.jpg");
		pm.deletePhoto("hedgehog.jpg");
		//pm.deletePhoto("panda.jpg");
	
		System.out.println("All Photos in Album w/o butterfly1.jpg and hedgehog.jpg");
		display(album.getPhotos()); // displays all photos w/o butterfly1.jpg
		System.out.println(album.getNbComps());
		System.out.println();
		
		System.out.println("_________________________________________");

		album = new Album("Bears", "bear", pm);
		System.out.println("All Photos Containing bear Tag");
		display(album.getPhotos());
		System.out.println(album.getNbComps());
		System.out.println();
		
		System.out.println("_________________________________________");

		album = new Album("empty", "gecko", pm);
		System.out.println("All Photos Containing gecko Tag");
		display(album.getPhotos()); // should be empty
		System.out.println(album.getNbComps());
		System.out.println();
		
		System.out.println("_________________________________________");

		album = new Album("empty", "animal AND grass", pm);
		System.out.println("All Photos Containing animal and grass Tags");
		display(album.getPhotos());
		System.out.println(album.getNbComps());
		System.out.println();
		
		System.out.println("_________________________________________");

		pm.addPhoto(p1);
		album = new Album("Bears", "animal AND grass AND bear", pm);
		System.out.println("All Photos Containing animal and grass and bear Tags");
		display(album.getPhotos());
		System.out.println(album.getNbComps());
		System.out.println();
		
		System.out.println("_________________________________________");

		album = new Album("Wolf", "wolf AND sky AND snow AND cloud", pm);
		System.out.println("All Photos Containing wolf and sky and snow and cloud Tags");
		display(album.getPhotos());
		System.out.println(album.getNbComps());
		
		System.out.println("_________________________________________");

		album = new Album("empty", "animal AND omnivore", pm);
		System.out.println("All Photos Containing animal and omnivore Tags");
		display(album.getPhotos()); // empty
		System.out.println(album.getNbComps());
		System.out.println();
		
		System.out.println("_________________________________________");

		album = new Album("Butterfly", "insect AND black AND flower AND butterfly", pm);
		System.out.println("All Photos Containing insect and black and flower and butterfly Tags");
		display(album.getPhotos());
		System.out.println(album.getNbComps());
		System.out.println();
		
		System.out.println("_________________________________________");

		album = new Album("empty", "animal AND black AND flower", pm);
		System.out.println("All Photos Containing animal and black and flower Tags");
		display(album.getPhotos()); // empty
		System.out.println(album.getNbComps());
		System.out.println();
		
		System.out.println("_________________________________________");

		pm.addPhoto(p9);
		album = new Album("ALL", "", pm);
		System.out.println("All Photos in Album");
		display(album.getPhotos()); // include lizard
		System.out.println(album.getNbComps());
		System.out.println();
		
		System.out.println("_________________________________________");
		
		album = new Album("Lizard", "desert AND animal", pm);
		System.out.println("All Photos Containing desert and animal Tags");
		display(album.getPhotos());
		System.out.println(album.getNbComps());
		System.out.println();
		
		System.out.println("_________________________________________");

		album = new Album("Lizard", "animal AND desert", pm);
		System.out.println("All Photos Containing desert and animal Tags");
		display(album.getPhotos());
		System.out.println(album.getNbComps());
		System.out.println();
		
		System.out.println("_________________________________________");

		pm.deletePhoto("image.jpg");
		pm.addPhoto(new Photo("image.jpg", new LinkedList<String>()));
		pm.deletePhoto("image.jpg");
		album = new Album("ALL", "", pm);
		System.out.println("All Photos in Album");
		display(album.getPhotos());
		System.out.println(album.getNbComps());
	}

	public static void display(LinkedList<Photo> l) {
		if (l == null || l.empty()) {
			System.out.println("Empty Photo List \n");
			return;
		}

		l.findFirst();
		while (!l.last()) {
			System.out.print(l.retrieve().getPath() + " --> ");
			l.findNext();
		}
		System.out.print(l.retrieve().getPath());
		System.out.println("\n");
	}
}






