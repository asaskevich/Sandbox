#include "windows.h"
#include "windowsx.h"
#include "tchar.h"
#include <string>

typedef std::basic_string<TCHAR, std::char_traits<TCHAR>, std::allocator<TCHAR> > String;

TCHAR WinName[] = _T("Example3");
TCHAR *LeftKey = _T("Left Mouse Click");
TCHAR *RightKey = _T("Right Mouse Click");
TCHAR *LeftKeySpec = _T("Left Mouse Click with special key");
TCHAR *RightKeySpec = _T("Right Mouse Click with special key");

LRESULT CALLBACK WndProc(HWND, UINT, WPARAM, LPARAM);

int APIENTRY _tWinMain(HINSTANCE hInstance, HINSTANCE prevInstance, LPTSTR lpCmdLine, int nCmdShow) {
	HWND hWnd;
	MSG msg;
	WNDCLASS wnd;
	wnd.hInstance = hInstance;
	wnd.lpszClassName = WinName;
	wnd.style = CS_VREDRAW | CS_HREDRAW;
	wnd.hIcon = LoadIcon(NULL, IDI_WINLOGO);
	wnd.hCursor = LoadCursor(NULL, IDC_ARROW);
	wnd.hbrBackground = (HBRUSH) (COLOR_WINDOW + 1);
	wnd.lpszMenuName = NULL;
	wnd.cbClsExtra = 0;
	wnd.cbWndExtra = 0;
	wnd.lpfnWndProc = WndProc;
	if (!RegisterClass(&wnd)) return -1;
	hWnd = CreateWindow(WinName, WinName, WS_OVERLAPPEDWINDOW, CW_USEDEFAULT, CW_USEDEFAULT, CW_USEDEFAULT, CW_USEDEFAULT, HWND_DESKTOP, NULL, hInstance, NULL);
	ShowWindow(hWnd, nCmdShow);
	while (GetMessage(&msg, NULL, 0, 0)) {
		TranslateMessage(&msg);
		DispatchMessage(&msg);
	}
	return 0;
}

LRESULT CALLBACK WndProc(HWND hwnd, UINT Message, WPARAM wparam, LPARAM lparam) {
	HDC hdc;
	int x, y;
	static String str;
	if (Message == WM_RBUTTONDOWN) {
		y = HIWORD(lparam);
		x = LOWORD(lparam);
		hdc = GetDC(hwnd);
		if ((MK_ALT | MK_SHIFT | MK_CONTROL) & wparam) TextOut(hdc, x, y, RightKeySpec, _tcslen(RightKeySpec));
		else TextOut(hdc, x, y, RightKey, _tcslen(RightKey));
		ReleaseDC(hwnd, hdc);
	}
	if (Message == WM_LBUTTONDOWN) {
		y = HIWORD(lparam);
		x = LOWORD(lparam);
		hdc = GetDC(hwnd);
		if ((MK_ALT | MK_SHIFT | MK_CONTROL) & wparam) TextOut(hdc, x, y, LeftKeySpec, _tcslen(LeftKeySpec));
		else TextOut(hdc, x, y, LeftKey, _tcslen(LeftKey));
		ReleaseDC(hwnd, hdc);
	}
	if (Message == WM_LBUTTONUP || Message == WM_RBUTTONUP) {
		InvalidateRect(hwnd, NULL, TRUE);
	}
	if (Message == WM_DESTROY) {
		PostQuitMessage(0);
		return 0;
	}
	return DefWindowProc(hwnd, Message, wparam, lparam);
}
