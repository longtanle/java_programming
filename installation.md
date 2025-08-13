# Java Installation Guide

This guide covers how to install Java on Windows, macOS, and Linux systems. We'll focus on installing OpenJDK, which is the open-source implementation of Java.

## Table of Contents

- [Checking Current Java Installation](#checking-current-java-installation)
- [Windows Installation](#windows-installation)
- [macOS Installation](#macos-installation)
- [Linux Installation](#linux-installation)
- [Setting Environment Variables](#setting-environment-variables)
- [Verification](#verification)
- [Multiple Java Versions](#multiple-java-versions)

## Checking Current Java Installation

Before installing Java, check if you already have it installed:

```bash
java -version
javac -version
```

If Java is installed, you'll see version information. If not, you'll get a "command not found" error.

## Windows Installation

### Using OpenJDK Downloads (Recommended)

1. **Download OpenJDK**
   - Visit the [OpenJDK website](https://jdk.java.net/archive/)
   - Navigate to the latest LTS version (currently Java 24, but let install an older version, Java 21, for stability)
   - Download the Windows x64 ZIP file

2. **Extract and Install**
   - Extract the ZIP file to a directory like `C:\Program Files\Java\openjdk-21`
   - Rename the extracted folder to something simple like `openjdk-21`

3. **Set Environment Variables**
   - Open System Properties → Advanced → Environment Variables
   - Add a new system variable:
     - Variable name: `JAVA_HOME`
     - Variable value: `C:\Program Files\Java\openjdk-21`
   - Edit the `PATH` variable and add: `%JAVA_HOME%\bin`

## macOS Installation

### Method 1: Using Homebrew (Recommended)

1. **Install Homebrew** (if not already installed):
   ```bash
   /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
   ```

2. **Install OpenJDK**:
   ```bash
   brew install openjdk@21
   ```

3. **Create Symlink** (for system recognition):
   ```bash
   sudo ln -sfn $(brew --prefix)/opt/openjdk@21/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk-21.jdk
   ```

### Method 2: Using Official Installer

1. **Download from Oracle or OpenJDK**
   - Visit [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) or [OpenJDK](https://jdk.java.net/archive/)
   - Download the macOS installer (.dmg file)

2. **Install**
   - Double-click the .dmg file
   - Follow the installation wizard
   - The installer automatically sets up the necessary paths

## Linux Installation

### Ubuntu/Debian

**Using APT Package Manager:**

```bash
# Update package index
sudo apt update

# Install OpenJDK 21
sudo apt install openjdk-21-jdk

# Or install default JDK (usually latest LTS)
sudo apt install default-jdk
```

## Setting Environment Variables

### Windows

1. Open System Properties → Advanced → Environment Variables
2. Add/modify these system variables:
   - `JAVA_HOME`: Path to your Java installation
   - `PATH`: Add `%JAVA_HOME%\bin`

### macOS/Linux

Add these lines to your shell profile file (`~/.bashrc`, `~/.zshrc`, or `~/.profile`):

```bash
export JAVA_HOME=/path/to/your/java/installation
export PATH=$JAVA_HOME/bin:$PATH
```

**Finding JAVA_HOME on macOS:**
```bash
/usr/libexec/java_home -v 21
```

**Finding JAVA_HOME on Linux:**
```bash
# Usually located at:
/usr/lib/jvm/java-21-openjdk-amd64  # Ubuntu/Debian
/usr/lib/jvm/java-21-openjdk        # CentOS/RHEL/Fedora
```

After editing, reload your profile:
```bash
source ~/.bashrc  # or ~/.zshrc
```

## Verification

After installation, verify Java is working correctly:

```bash
# Check Java Runtime Environment
java -version

# Check Java Compiler (JDK)
javac -version

# Check JAVA_HOME (on Unix-like systems)
echo $JAVA_HOME

# Check JAVA_HOME (on Windows)
echo %JAVA_HOME%
```

Expected output should show Java version 21 or your installed version.

## Multiple Java Versions

### Managing Multiple Versions

If you need multiple Java versions, consider using version managers:

**SDKMAN! (Cross-platform):**
```bash
# List available versions
sdk list java

# Install specific version
sdk install java 17.0.8-open

# Switch between versions
sdk use java 21.0.1-open
sdk default java 21.0.1-open
```

**jenv (macOS/Linux):**
```bash
# Install jenv
brew install jenv  # macOS

# Add Java versions
jenv add /path/to/java/home

# List versions
jenv versions

# Set global version
jenv global 21.0.1

# Set local version for project
jenv local 17.0.8
```

### Manual Switching (Linux/macOS)

Use `update-alternatives` on Ubuntu/Debian:

```bash
# Configure alternatives
sudo update-alternatives --install /usr/bin/java java /usr/lib/jvm/java-21-openjdk-amd64/bin/java 1
sudo update-alternatives --install /usr/bin/java java /usr/lib/jvm/java-17-openjdk-amd64/bin/java 2

# Switch between versions
sudo update-alternatives --config java
```

## Troubleshooting

### Common Issues

**"java: command not found"**
- Ensure Java is installed and PATH is set correctly
- Restart terminal/command prompt after setting environment variables

**JAVA_HOME not set**
- Verify JAVA_HOME points to the JDK installation directory (not the bin folder)
- On Windows, use forward slashes or double backslashes in paths

**Permission denied (Linux/macOS)**
- Use `sudo` for system-wide installations
- Check file permissions on Java installation directory

**Multiple Java versions conflict**
- Use version managers like SDKMAN! or jenv
- Ensure JAVA_HOME points to desired version
- Check which Java version is first in PATH

## Additional Resources

- [OpenJDK Official Website](https://openjdk.org/)
- [Oracle JDK Downloads](https://www.oracle.com/java/technologies/downloads/)
- [SDKMAN! Documentation](https://sdkman.io/)
- [Java Documentation](https://docs.oracle.com/en/java/)