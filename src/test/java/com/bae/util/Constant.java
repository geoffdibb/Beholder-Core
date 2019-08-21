package com.bae.util;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.activemq.broker.ConnectionContext;
import org.apache.activemq.broker.ProducerBrokerExchange;
import org.apache.activemq.broker.region.Destination;
import org.apache.activemq.broker.region.DestinationStatistics;
import org.apache.activemq.broker.region.MessageReference;
import org.apache.activemq.broker.region.Subscription;
import org.apache.activemq.broker.region.policy.DeadLetterStrategy;
import org.apache.activemq.broker.region.policy.SlowConsumerStrategy;
import org.apache.activemq.command.ActiveMQDestination;
import org.apache.activemq.command.Message;
import org.apache.activemq.command.MessageAck;
import org.apache.activemq.command.MessageDispatchNotification;
import org.apache.activemq.command.ProducerInfo;
import org.apache.activemq.store.MessageStore;
import org.apache.activemq.usage.MemoryUsage;
import org.apache.activemq.usage.TempUsage;
import org.apache.activemq.usage.Usage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.bae.entity.AuditRequestLog;
import com.bae.entity.AuditSearchLog;
import com.bae.entity.AuditUserAccessLog;
import com.bae.entity.User;

public class Constant {

	public static final ResponseEntity<String> MOCK_USERLOGIN_OBJECT = new ResponseEntity<String>("userLogin",
			HttpStatus.OK);
	public static final String MOCK_USERLOGIN_OBJECT2 = "userLogin";
	public static final String MOCK_USERLOGIN_OBJECT3 = null;

	public static final ResponseEntity<String> MOCK_SEARCH_OBJECT = new ResponseEntity<String>("search", HttpStatus.OK);
	public static final String MOCK_SEARCH_OBJECT2 = "search";
	public static final String MOCK_SEARCH_OBJECT3 = null;

	public static final ResponseEntity<String> MOCK_PROFILE_OBJECT = new ResponseEntity<String>("profile",
			HttpStatus.OK);
	public static final String MOCK_PROFILE_OBJECT2 = "profile";
	public static final String MOCK_PROFILE_OBJECT3 = null;

	public static final ResponseEntity<String> MOCK_AUDIT_OBJECT = new ResponseEntity<String>("audit", HttpStatus.OK);
	public static final String MOCK_AUDIT_OBJECT2 = "audit";
	public static final String MOCK_AUDIT_OBJECT3 = null;

	public static final AuditRequestLog MOCK_AUDITLOG_OBJECT = new AuditRequestLog("name", (long) 1);
	public static final AuditRequestLog MOCK_AUDITLOG_OBJECT2 = new AuditRequestLog("name", (long) 1);
	public static final String MOCK_AUDITLOG_OBJECT3 = null;

	public static final AuditSearchLog MOCK_AUDITSEARCH_OBJECT = new AuditSearchLog("name", (long) 1, "search");
	public static final AuditSearchLog MOCK_AUDITSEARCH_OBJECT2 = new AuditSearchLog("name", (long) 1, "search");
	public static final String MOCK_AUDITSEARCH_OBJECT3 = null;

	public static final AuditUserAccessLog MOCK_AUDITUSER_OBJECT = new AuditUserAccessLog("name", (long) 1);
	public static final AuditUserAccessLog MOCK_AUDITUSER_OBJECT2 = new AuditUserAccessLog("name", (long) 1);
	public static final String MOCK_AUDITUSER_OBJECT3 = null;
	public static final String MOCK_AUDITUSER_OBJECT4 = "Audit user logs sent";

	public static final Date MOCK_TIME_OBJECT = new Date();

	public static final String MOCK_CATEGORY_OBJECT = "category";
	public static final String MOCK_SEARCHTERM_OBJECT = "searchTerm";
	public static final long MOCK_ID_OBJECT = 1;

	public static final User MOCK_USER_OBJECT = new User("name", (long) 1, "password");
	public static final User MOCK_USER_OBJECT2 = new User("name", (long) 1, "password");
	
	public static final Destination destination = new Destination() {

		@Override
		public void start() throws Exception {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void stop() throws Exception {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean iterate() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void addSubscription(ConnectionContext context, Subscription sub) throws Exception {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void removeSubscription(ConnectionContext context, Subscription sub, long lastDeliveredSequenceId)
				throws Exception {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void addProducer(ConnectionContext context, ProducerInfo info) throws Exception {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void removeProducer(ConnectionContext context, ProducerInfo info) throws Exception {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void send(ProducerBrokerExchange producerExchange, Message messageSend) throws Exception {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void acknowledge(ConnectionContext context, Subscription sub, MessageAck ack, MessageReference node)
				throws IOException {
			// TODO Auto-generated method stub
			
		}

		@Override
		public long getInactiveTimeoutBeforeGC() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void markForGC(long timeStamp) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean canGC() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void gc() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public ActiveMQDestination getActiveMQDestination() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public MemoryUsage getMemoryUsage() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setMemoryUsage(MemoryUsage memoryUsage) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public TempUsage getTempUsage() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void dispose(ConnectionContext context) throws IOException {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean isDisposed() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public DestinationStatistics getDestinationStatistics() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public DeadLetterStrategy getDeadLetterStrategy() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Message[] browse() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getName() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public MessageStore getMessageStore() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean isProducerFlowControl() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void setProducerFlowControl(boolean value) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean isAlwaysRetroactive() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void setAlwaysRetroactive(boolean value) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void setBlockedProducerWarningInterval(long blockedProducerWarningInterval) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public long getBlockedProducerWarningInterval() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getMaxProducersToAudit() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void setMaxProducersToAudit(int maxProducersToAudit) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public int getMaxAuditDepth() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void setMaxAuditDepth(int maxAuditDepth) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean isEnableAudit() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void setEnableAudit(boolean enableAudit) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean isActive() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public int getMaxPageSize() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void setMaxPageSize(int maxPageSize) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public int getMaxBrowsePageSize() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void setMaxBrowsePageSize(int maxPageSize) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean isUseCache() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void setUseCache(boolean useCache) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public int getMinimumMessageSize() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void setMinimumMessageSize(int minimumMessageSize) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public int getCursorMemoryHighWaterMark() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void setCursorMemoryHighWaterMark(int cursorMemoryHighWaterMark) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void wakeup() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean isLazyDispatch() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void setLazyDispatch(boolean value) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void messageExpired(ConnectionContext context, Subscription subs, MessageReference node) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void messageConsumed(ConnectionContext context, MessageReference messageReference) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void messageDelivered(ConnectionContext context, MessageReference messageReference) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void messageDiscarded(ConnectionContext context, Subscription sub, MessageReference messageReference) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void slowConsumer(ConnectionContext context, Subscription subs) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void fastProducer(ConnectionContext context, ProducerInfo producerInfo) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void isFull(ConnectionContext context, Usage<?> usage) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public List<Subscription> getConsumers() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void processDispatchNotification(MessageDispatchNotification messageDispatchNotification)
				throws Exception {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean isPrioritizedMessages() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public SlowConsumerStrategy getSlowConsumerStrategy() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean isDoOptimzeMessageStorage() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void setDoOptimzeMessageStorage(boolean doOptimzeMessageStorage) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void clearPendingMessages() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void duplicateFromStore(Message message, Subscription subscription) {
			// TODO Auto-generated method stub
			
		}};

}
