//package ex4_tests.ex4_2_tests;
//
//import ascii_art.Driver;
//import ascii_art.Shell;
//import ascii_art.img_to_char.BrightnessImgCharMatcher;
//import ascii_output.HtmlAsciiOutput;
//import ex4_tests.ex4_1_tests.BrightnessImgCharMatcherTest;
//import image.Image;
//
//import java.io.File;
//import java.io.IOException;
//import java.nio.file.Paths;
//
//public class ShellTest extends BrightnessImgCharMatcherTest {
//	private static final String OUTPUT_FILENAME = "out";
//	private static final String COMPILED_ASCII_ART_DIR = "\"C:/Users/0erel/IdeaProjects/OOPProjects/ex4/out/production/ex4/ascii_art\"";
//
//	public ShellTest() {
//		ProcessBuilder pb = new ProcessBuilder("java","-cp",COMPILED_ASCII_ART_DIR, "ascii_art.Driver");
//	}
//
//
//	@Override
//	/* Runs chooseChar and checks that the output is identical to the compare file. */
//	protected long CompareOutputWithPicture(String imageName, int numCharsInRow) throws IOException {
//
//		return compareFilesByLine(
//				Paths.get(TESTS_DIR + COMPARE_DIR + imageName + numCharsInRow + HTML),
//				Paths.get(OUTPUT_FILENAME + HTML)
//		);
//	}
//}
