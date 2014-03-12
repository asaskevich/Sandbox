import unittest

# Simple class that contain 4 tests
class Tester(unittest.TestCase):
    # All test methods must have names like test*
    def test_1(self):
        self.assertEqual(2 * 5, 10)

    def test_2(self):
        self.assertGreater(6, 3)

    def test_3(self):
        self.assertLess(3, 7)

    def test_4(self):
        self.assertRegex("#00FFAA", "^#[0-9a-fA-F]{6}")

    def test_5(self):
        self.assertTrue(True)

# Entry point
if __name__ == "__main__":
    unittest.main()
