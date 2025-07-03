# WindowsPanel (JavaFX + OSHI)

🚀 **WindowsPanel** ist ein JavaFX-basiertes Desktop-Tool, das mit **OSHI** Hardware- und Systeminformationen von Windows-Geräten anzeigt und einfache Systemfunktionen wie das Leeren des Papierkorbs integriert.

---

## ✨ Features

✅ Anzeige von CPU-, RAM- und Speicherinformationen (via [OSHI](https://github.com/oshi/oshi))  
✅ JavaFX GUI mit modernem Panel-Aufbau  
✅ Papierkorb leeren direkt aus der App (Windows-only)  
✅ Geräte-Manager öffnen (Windows-only)  
✅ Modulares JavaFX-Projekt (`module-info.java`)

---

## 🚧 Plattform

✅ **Vollständig getestet auf Windows**

⚠️ **Teile des Projekts (Papierkorb, Geräte-Manager) funktionieren unter Linux/macOS nicht.**  
Das Projekt startet jedoch auch auf UNIX, falls OSHI-basiertes Monitoring getestet werden soll.

---

## 🛠️ Installation

### Voraussetzungen:
- Java 17 oder höher
- JavaFX SDK
- OSHI Bibliothek (`oshi-core`)

### Build (CLI):

```bash
javac --module-path PATH_ZUM_JAVAFX_LIB --add-modules javafx.controls,javafx.fxml -d out $(find src -name "*.java")
