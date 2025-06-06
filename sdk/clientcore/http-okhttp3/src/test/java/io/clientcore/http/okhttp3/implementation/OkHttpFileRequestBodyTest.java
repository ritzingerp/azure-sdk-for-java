// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package io.clientcore.http.okhttp3.implementation;

import io.clientcore.core.models.binarydata.FileBinaryData;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.Source;
import okio.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class OkHttpFileRequestBodyTest {
    private static final Random RANDOM = new Random();

    @ParameterizedTest
    @ValueSource(ints = { 1, 10, 127, 1024, 1024 + 113, 10 * 1024 * 1024, 10 * 1024 * 1024 + 113 })
    public void transferContentTransferAll(int size) throws Exception {
        Path file = Files.createTempFile("OkHttpFileRequestBodyTest", null);
        file.toFile().deleteOnExit();
        byte[] bytes = new byte[size];
        RANDOM.nextBytes(bytes);
        Files.write(file, bytes);

        OkHttpFileRequestBody fileRequestBody
            = new OkHttpFileRequestBody(new FileBinaryData(file, 1024, 0L, null), bytes.length, null);

        TestSink sink = new TestSink(false);

        fileRequestBody.writeTo(sink);

        assertArrayEquals(sink.getData(), bytes);
    }

    @ParameterizedTest
    @ValueSource(ints = { 1, 10, 127, 1024, 1024 + 113, 10 * 1024 * 1024, 10 * 1024 * 1024 + 113 })
    public void transferContentWithIncompleteTransferTo(int size) throws Exception {
        Path file = Files.createTempFile("OkHttpFileRequestBodyTest", null);
        file.toFile().deleteOnExit();
        byte[] bytes = new byte[size];
        RANDOM.nextBytes(bytes);
        Files.write(file, bytes);

        OkHttpFileRequestBody fileRequestBody
            = new OkHttpFileRequestBody(new FileBinaryData(file, 1024, 0L, null), bytes.length, null);

        TestSink sink = new TestSink(true);

        fileRequestBody.writeTo(sink);

        assertArrayEquals(sink.getData(), bytes);
    }

    @ParameterizedTest
    @ValueSource(ints = { 1, 10, 127, 1024, 1024 + 113, 10 * 1024 * 1024, 10 * 1024 * 1024 + 113 })
    public void transferContentWithIncompleteTransferToWithOversizeContent(int size) throws Exception {
        Path file = Files.createTempFile("OkHttpFileRequestBodyTest", null);
        file.toFile().deleteOnExit();
        byte[] bytes = new byte[size];
        RANDOM.nextBytes(bytes);
        Files.write(file, bytes);

        OkHttpFileRequestBody fileRequestBody
            = new OkHttpFileRequestBody(new FileBinaryData(file, 1024, 0L, size + 112L), bytes.length, null);

        TestSink sink = new TestSink(true);

        fileRequestBody.writeTo(sink);

        assertArrayEquals(sink.getData(), bytes);
    }

    private static final class TestSink implements BufferedSink {

        private final boolean simulateIncompleteRead;

        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        /**
         * @param simulateIncompleteRead a flag that enables partial buffer consumption.
         *                               This behavior makes FileChannel abandon transferTo prematurely before reaching
         *                               out to end of file.
         */
        private TestSink(boolean simulateIncompleteRead) {
            this.simulateIncompleteRead = simulateIncompleteRead;
        }

        public byte[] getData() {
            return bos.toByteArray();
        }

        @Override
        public Buffer getBuffer() {
            return null;
        }

        @SuppressWarnings("deprecation")
        @Override
        public Buffer buffer() {
            return null;
        }

        @Override
        public BufferedSink emit() {
            return null;
        }

        @Override
        public BufferedSink emitCompleteSegments() {
            return null;
        }

        @Override
        public void flush() {

        }

        @Override
        public OutputStream outputStream() {
            return null;
        }

        @Override
        public BufferedSink write(byte[] bytes) {
            return null;
        }

        @Override
        public BufferedSink write(byte[] bytes, int i, int i1) {
            return null;
        }

        @Override
        public BufferedSink write(ByteString byteString) {
            return null;
        }

        @Override
        public BufferedSink write(ByteString byteString, int i, int i1) {
            return null;
        }

        @Override
        public BufferedSink write(Source source, long l) {
            return null;
        }

        @Override
        public long writeAll(Source source) {
            return 0;
        }

        @Override
        public BufferedSink writeByte(int i) {
            return null;
        }

        @Override
        public BufferedSink writeDecimalLong(long l) {
            return null;
        }

        @Override
        public BufferedSink writeHexadecimalUnsignedLong(long l) {
            return null;
        }

        @Override
        public BufferedSink writeInt(int i) {
            return null;
        }

        @Override
        public BufferedSink writeIntLe(int i) {
            return null;
        }

        @Override
        public BufferedSink writeLong(long l) {
            return null;
        }

        @Override
        public BufferedSink writeLongLe(long l) {
            return null;
        }

        @Override
        public BufferedSink writeShort(int i) {
            return null;
        }

        @Override
        public BufferedSink writeShortLe(int i) {
            return null;
        }

        @Override
        public BufferedSink writeString(String s, Charset charset) {
            return null;
        }

        @Override
        public BufferedSink writeString(String s, int i, int i1, Charset charset) {
            return null;
        }

        @Override
        public BufferedSink writeUtf8(String s) {
            return null;
        }

        @Override
        public BufferedSink writeUtf8(String s, int i, int i1) {
            return null;
        }

        @Override
        public BufferedSink writeUtf8CodePoint(int i) {
            return null;
        }

        @Override
        public int write(ByteBuffer src) throws IOException {
            byte[] buf;

            if (simulateIncompleteRead && src.remaining() > 1) {
                buf = new byte[src.remaining() - 1];
            } else {
                buf = new byte[src.remaining()];
            }
            src.get(buf);
            bos.write(buf);
            return buf.length;
        }

        @Override
        public boolean isOpen() {
            return true;
        }

        @Override
        public void close() {

        }

        @Override
        public Timeout timeout() {
            return null;
        }

        @Override
        public void write(Buffer buffer, long l) {

        }
    }
}
